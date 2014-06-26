// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CategoryGroupSearchRequest.java

package com.jd.open.api.sdk.request.category;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CategoryGroupSearchRequest extends AbstractRequest
        implements JdRequest {

    public CategoryGroupSearchRequest() {
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getApiMethod() {
        return "360buy.ware.groups.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new HashMap();
        map.put("fields", fields);
        map.put("cid", cid);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.category.CategoryGroupSearchResponse.class;
    }

    private String fields;
    private String cid;
}
