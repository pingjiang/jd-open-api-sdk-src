// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareCategoryGetRequest.java

package com.jd.open.api.sdk.request.website.category;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.website.category.WareCategoryGetResponse;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareCategoryGetRequest extends AbstractRequest
        implements JdRequest {

    public WareCategoryGetRequest() {
    }

    public String getApiMethod() {
        return "jingdong.warecategory.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("cid", cid);
        pmap.put("level", level);
        pmap.put("fields", fields);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return WareCategoryGetResponse.class;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    private String cid;
    private String level;
    private String fields;
}
