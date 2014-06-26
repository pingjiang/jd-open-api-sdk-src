// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CategoryAttributeSearchRequest.java

package com.jd.open.api.sdk.request.category;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CategoryAttributeSearchRequest extends AbstractRequest
        implements JdRequest {

    public CategoryAttributeSearchRequest() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getKeyProp() {
        return isKeyProp;
    }

    public void setKeyProp(String keyProp) {
        isKeyProp = keyProp;
    }

    public String getSaleProp() {
        return isSaleProp;
    }

    public void setSaleProp(String saleProp) {
        isSaleProp = saleProp;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getApiMethod() {
        return "360buy.ware.get.attribute";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new TreeMap();
        map.put("cid", cid);
        map.put("aid", aid);
        map.put("is_sale_prop", isSaleProp);
        map.put("is_key_prop", isKeyProp);
        map.put("fields", fields);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.category.CategoryAttributeSearchResponse.class;
    }

    private String cid;
    private String isKeyProp;
    private String isSaleProp;
    private String aid;
    private String fields;
}
