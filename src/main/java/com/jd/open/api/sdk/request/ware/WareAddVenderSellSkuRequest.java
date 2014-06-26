// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareAddVenderSellSkuRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareAddVenderSellSkuRequest extends AbstractRequest
        implements JdRequest {

    public WareAddVenderSellSkuRequest() {
    }

    public String getApiMethod() {
        return "360buy.wares.vendersellsku.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("category_id", category_id);
        pmap.put("index_id", index_id);
        pmap.put("attribute_id", attribute_id);
        pmap.put("attribute_value", attribute_value);
        pmap.put("features", features);
        pmap.put("status", status);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WareAddVenderSellSkuResponse.class;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getIndex_id() {
        return index_id;
    }

    public void setIndex_id(String index_id) {
        this.index_id = index_id;
    }

    public String getAttribute_id() {
        return attribute_id;
    }

    public void setAttribute_id(String attribute_id) {
        this.attribute_id = attribute_id;
    }

    public String getAttribute_value() {
        return attribute_value;
    }

    public void setAttribute_value(String attribute_value) {
        this.attribute_value = attribute_value;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String category_id;
    private String index_id;
    private String attribute_id;
    private String attribute_value;
    private String features;
    private String status;
}
