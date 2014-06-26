// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsO2oSkuStock_ownerUpdateRequest.java

package com.jd.open.api.sdk.request.O2O;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsO2oSkuStock_ownerUpdateRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsO2oSkuStock_ownerUpdateRequest() {
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStockOwner(String stockOwner) {
        this.stockOwner = stockOwner;
    }

    public String getStockOwner() {
        return stockOwner;
    }

    public String getApiMethod() {
        return "jingdong.logistics.o2o.sku.stock_owner.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("spu_id", spuId);
        pmap.put("sku_id", skuId);
        pmap.put("name", name);
        pmap.put("stock_owner", stockOwner);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.O2O.LogisticsO2oSkuStock_ownerUpdateResponse.class;
    }

    private Integer spuId;
    private String skuId;
    private String name;
    private String stockOwner;
}
