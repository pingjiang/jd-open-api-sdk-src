package com.jd.open.api.sdk.apiutils;

import com.jd.open.api.sdk.request.JdRequest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

/**
 * Created by pingjiang on 14-6-26.
 *
 * 类目API - http://help.jd.com/jos/question-627.html
 * 商品API - http://help.jd.com/jos/question-628.html
 * 推荐API - http://help.jd.com/jos/question-629.html
 * 京东联盟API - http://help.jd.com/jos/question-725.html
 * 价格及促销API - http://help.jd.com/jos/question-809.html
 * 授权登陆 - http://help.jd.com/jos/question-753.html
 * 类目API - http://help.jd.com/jos/question-567.html
 * 店铺API - http://help.jd.com/jos/question-735.html
 * 商品API - http://help.jd.com/jos/question-568.html
 * SKU API - http://help.jd.com/jos/question-573.html
 * 订单API - http://help.jd.com/jos/question-569.html
 * 备件库API - http://help.jd.com/jos/question-898.html
 * 工单API - http://help.jd.com/jos/question-877.html
 * 自主售后API - http://help.jd.com/jos/question-570.html
 * 配送API - http://help.jd.com/jos/question-571.html
 * 京东地址库API - http://help.jd.com/jos/question-827.html
 * 物流API - http://help.jd.com/jos/question-814.html
 * 京东快车API - http://help.jd.com/jos/question-813.html
 * 数据API - http://help.jd.com/jos/question-878.html
 * 促销API - http://help.jd.com/jos/question-815.html
 * 图片空间API - http://help.jd.com/jos/question-838.html
 * 咚咚API - http://help.jd.com/jos/question-879.html
 * 服务平台API - http://help.jd.com/jos/question-824.html
 * 供应商API - http://help.jd.com/jos/question-842.html
 *
 */
public class JDApiExporter implements ApiExporter {
    public String getSuitName() {
        return "jd-open-api-sdk";
    }

    public String getVersion() {
        return "2.0.0";
    }

    public String getProvider() {
        return "http://help.jd.com/jos/question-594.html";
    }

    public List<Class<?>> getApiClasses(String group) {
        List<Class<?>> found = ClassFinder.find(group, JdRequest.class);
        return found;
    }

    public ApiDescriptor getApi(Class<?> clzName) {
        ApiDescriptor descriptor = new ApiDescriptor();
        descriptor.setGroup(clzName.getPackage().getName());
        descriptor.setName(clzName.getSimpleName());
        descriptor.setMethod(JDApiExporter.<String>invokeRequestMethod(clzName, "getApiMethod"));
        descriptor.setRequest(getNonStaticPrivateFields(clzName));

        Class<?> responseClass = invokeRequestMethod(clzName, "getResponseClass");
        descriptor.setResponse(getNonStaticPrivateFields(responseClass));

        return descriptor;
    }

    public void export(String jsonFilePath) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(jsonFilePath != null ? new FileWriter(jsonFilePath) : new OutputStreamWriter(System.out));

            write(writer);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void write(BufferedWriter writer) throws IOException {
        writer.write('{');
        writer.newLine();
        writer.write(String.format("\t\"%s\": \"%s\",", "api-suit-name", getSuitName()));
        writer.newLine();
        writer.write(String.format("\t\"%s\": \"%s\",", "version", getVersion()));
        writer.newLine();
        writer.write(String.format("\t\"%s\": \"%s\",", "provider", getProvider()));
        writer.newLine();

        List<Class<?>> classes = getApiClasses("com.jd.open.api.sdk.request");
        for (int i = 0; i < classes.size(); i++) {
            Class<?> clsName = classes.get(i);
            if (clsName.getSimpleName().equals("JdUploadRequest")) {
                continue;
            }

            ApiDescriptor apiDescriptor = getApi(clsName);
            apiDescriptor.write(writer, i == (classes.size() - 1));
        }

        writer.write("}");
        writer.newLine();
    }

    private static <T> T invokeRequestMethod(Class<?> clzName, String methodName) {
        try {
            Method method = clzName.getMethod(methodName);
            JdRequest instance = (JdRequest)clzName.newInstance();
            T apiMethod = (T)method.invoke(instance);
            return apiMethod;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static ApiBody getNonStaticPrivateFields(Class<?> clzName) {
        Field[] fields = clzName.getDeclaredFields();
        ApiBody body = new ApiBody();
        for (Field field : fields) {
            if (Modifier.isPrivate(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                body.addField(field.getName(), field.getType(), field.getGenericType());
            }
        }

        return body;
    }

    public static void main(String[] args) {
        ApiExporter exporter = new JDApiExporter();
        exporter.export(args > 0 ? args[0] : "jd-open-api.json");
    }
}
