// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareCatelogyAttributeListGetRequest.java

package com.jd.open.api.sdk.request.list;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareCatelogyAttributeListGetRequest extends AbstractRequest
        implements JdRequest {

    public WareCatelogyAttributeListGetRequest() {
    }

    public void setNewVersion(Integer newVersion) {
        this.newVersion = newVersion;
    }

    public Integer getNewVersion() {
        return newVersion;
    }

    public void setCatelogyId(String catelogyId) {
        this.catelogyId = catelogyId;
    }

    public String getCatelogyId() {
        return catelogyId;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getClient() {
        return client;
    }

    public String getApiMethod() {
        return "jingdong.ware.catelogy.attribute.list.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("newVersion", newVersion);
        pmap.put("catelogyId", catelogyId);
        pmap.put("client", client);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.list.WareCatelogyAttributeListGetResponse.class;
    }

    private Integer newVersion;
    private String catelogyId;
    private String client;
}
