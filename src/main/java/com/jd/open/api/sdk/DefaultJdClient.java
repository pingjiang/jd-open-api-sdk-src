// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DefaultJdClient.java

package com.jd.open.api.sdk;

import com.jd.open.api.sdk.internal.parser.Parser;
import com.jd.open.api.sdk.internal.parser.ParserFactory;
import com.jd.open.api.sdk.internal.util.CodecUtil;
import com.jd.open.api.sdk.internal.util.HttpUtil;
import com.jd.open.api.sdk.internal.util.StringUtil;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.request.JdUploadRequest;
import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.jd.open.api.sdk:
//            JdException, JdClient

public class DefaultJdClient
        implements JdClient {

    public DefaultJdClient(String serverUrl, String accessToken, String appKey, String appSecret) {
        connectTimeout = 0;
        readTimeout = 0;
        this.serverUrl = serverUrl;
        this.accessToken = accessToken;
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    public DefaultJdClient(String serverUrl, String accessToken, String appKey, String appSecret, int connectTimeout, int readTimeout) {
        this(serverUrl, accessToken, appKey, appSecret);
        this.connectTimeout = connectTimeout;
        this.readTimeout = readTimeout;
    }

    public AbstractResponse execute(JdRequest request)
            throws JdException {
        try {
            String url = buildUrl(request);
            Map params = new HashMap();
            String json = request.getAppJsonParams();
            params.put("360buy_param_json", json);
            String rsp = null;
            if (request instanceof JdUploadRequest)
                rsp = HttpUtil.doPost(url, params, ((JdUploadRequest) request).getFileParams(), connectTimeout, readTimeout);
            else
                rsp = HttpUtil.doPost(url, params, connectTimeout, readTimeout);
            AbstractResponse resp = parse(rsp, request.getResponseClass());
            StringBuffer sb = new StringBuffer();
            sb.append(url).append("&").append("360buy_param_json").append("=").append(json);
            resp.setUrl(sb.toString());
            return resp;
        } catch (Exception e) {
            throw new JdException("服务器连接超时，请重试");
        }
    }

    private String buildUrl(JdRequest request)
            throws Exception {
        Map sysParams = request.getSysParams();
        Map pmap = new TreeMap();
        pmap.put("360buy_param_json", request.getAppJsonParams());
        sysParams.put("method", request.getApiMethod());
        sysParams.put("access_token", accessToken);
        sysParams.put("app_key", appKey);
        pmap.putAll(sysParams);
        String sign = sign(pmap, appSecret);
        sysParams.put("sign", sign);
        StringBuilder sb = new StringBuilder(serverUrl);
        sb.append("?");
        sb.append(HttpUtil.buildQuery(sysParams, "UTF-8"));
        return sb.toString();
    }

    private AbstractResponse parse(String rsp, Class responseClass)
            throws JdException {
        Parser parser;
        if (serverUrl.endsWith("json"))
            parser = ParserFactory.getJsonParser();
        else
            parser = ParserFactory.getXmlParser();
        return parser.parse(rsp, responseClass);
    }

    private String sign(Map pmap, String appSecret)
            throws Exception {
        StringBuilder sb = new StringBuilder(appSecret);
        Iterator i$ = pmap.entrySet().iterator();
        do {
            if (!i$.hasNext())
                break;
            java.util.Map.Entry entry = (java.util.Map.Entry) i$.next();
            String name = (String) entry.getKey();
            String value = (String) entry.getValue();
            if (StringUtil.areNotEmpty(new String[]{
                    name, value
            }))
                sb.append(name).append(value);
        } while (true);
        sb.append(appSecret);
        String result = CodecUtil.md5(sb.toString());
        return result;
    }

    public static final String CHARSET_UTF8 = "UTF-8";
    private static final String JSON_PARAM_KEY = "360buy_param_json";
    private String serverUrl;
    private String accessToken;
    private int connectTimeout;
    private int readTimeout;
    private String appKey;
    private String appSecret;
}
