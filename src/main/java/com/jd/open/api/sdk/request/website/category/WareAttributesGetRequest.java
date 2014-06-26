// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareAttributesGetRequest.java

package com.jd.open.api.sdk.request.website.category;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.website.category.WareAttributesGetResponse;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareAttributesGetRequest extends AbstractRequest
        implements JdRequest {

    public WareAttributesGetRequest() {
    }

    public String getApiMethod() {
        return "jingdong.wareattributes.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("cid", cid);
        pmap.put("fields", fields);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return WareAttributesGetResponse.class;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getFields() {
        return fields;
    }

    public void setFileds(String fields) {
        this.fields = fields;
    }

    private String cid;
    private String fields;
}
