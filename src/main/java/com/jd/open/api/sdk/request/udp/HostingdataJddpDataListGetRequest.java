// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HostingdataJddpDataListGetRequest.java

package com.jd.open.api.sdk.request.udp;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HostingdataJddpDataListGetRequest extends AbstractRequest
        implements JdRequest {

    public HostingdataJddpDataListGetRequest() {
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public String getSqlId() {
        return sqlId;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }

    public String getApiMethod() {
        return "jingdong.hostingdata.jddp.data.list.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("sqlId", sqlId);
        pmap.put("parameter", parameter);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.udp.HostingdataJddpDataListGetResponse.class;
    }

    private String sqlId;
    private String parameter;
}
