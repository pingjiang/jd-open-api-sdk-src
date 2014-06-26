package com.jd.open.api.sdk.apiutils;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Created by pingjiang on 14-6-26.
 */
public class ApiDescriptor {
    private String group;
    private String groupCN;
    private String name;
    private String method;
    private ApiBody request;
    private ApiBody response;

    public String getGroup() {
        int pos = group.indexOf("com.jd.open.api.sdk.request.");
        if (pos != -1) {
            return group.substring(pos + "com.jd.open.api.sdk.request.".length());
        }

        return group;
    }

    public String getGroupCN() {
        return groupCN;
    }

    public void setGroupCN(String groupCN) {
        this.groupCN = groupCN;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ApiBody getRequest() {
        return request;
    }

    public void setRequest(ApiBody request) {
        this.request = request;
    }

    public ApiBody getResponse() {
        return response;
    }

    public void setResponse(ApiBody response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "ApiDescriptor{" +
                "group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", method='" + method + '\'' +
                ", request=" + request +
                ", response=" + response +
                '}';
    }

    public void write(BufferedWriter writer, boolean last) throws IOException {
        writer.write("\t\"api\": {");
        writer.newLine();
        writer.write(String.format("\t\t\"%s\": \"%s\",", "group", getGroup()));
        writer.newLine();
        writer.write(String.format("\t\t\"%s\": \"%s\",", "name", getName()));
        writer.newLine();
        writer.write(String.format("\t\t\"%s\": \"%s\",", "method", getMethod()));
        writer.newLine();
        writer.write("\t\t\"request\": {");
        writer.newLine();
        // fields
        getRequest().write(writer);

        writer.write("\t\t}, ");
        writer.newLine();

        writer.write("\t\t\"response\": {");
        writer.newLine();
        // fields
        getResponse().write(writer);

        writer.write("\t\t}");
        writer.newLine();

        writer.write(String.format("\t}%s", last ? "" : ", "));
        writer.newLine();
    }
}
