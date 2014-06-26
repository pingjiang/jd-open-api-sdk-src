// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CategoryAttributeValueSearchRequest.java

package com.jd.open.api.sdk.request.category;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CategoryAttributeValueSearchRequest extends AbstractRequest
        implements JdRequest {

    public CategoryAttributeValueSearchRequest() {
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getApiMethod() {
        return "360buy.ware.get.attvalue";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new TreeMap();
        map.put("avs", avs);
        map.put("fields", fields);
        return JsonUtil.toJson(map);
    }

    public String getAvs() {
        return avs;
    }

    public void setAvs(String avs) {
        this.avs = avs;
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.category.CategoryAttributeValueSearchResponse.class;
    }

    private String avs;
    private String fields;
}
