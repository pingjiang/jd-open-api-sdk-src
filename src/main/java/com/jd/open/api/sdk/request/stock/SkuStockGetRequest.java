// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SkuStockGetRequest.java

package com.jd.open.api.sdk.request.stock;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SkuStockGetRequest extends AbstractRequest
        implements JdRequest {

    public SkuStockGetRequest() {
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaId() {
        return areaId;
    }

    public String getApiMethod() {
        return "jingdong.sku.stock.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("sku_id", skuId);
        pmap.put("area_id", areaId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.stock.SkuStockGetResponse.class;
    }

    private Long skuId;
    private String areaId;
}
