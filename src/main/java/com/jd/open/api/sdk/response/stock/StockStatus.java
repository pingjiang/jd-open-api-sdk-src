// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StockStatus.java

package com.jd.open.api.sdk.response.stock;

import java.io.Serializable;

public class StockStatus
        implements Serializable {

    public StockStatus() {
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

    public void setStockStateId(Long stockStateId) {
        this.stockStateId = stockStateId;
    }

    public Long getStockStateId() {
        return stockStateId;
    }

    public void setStockStateDesc(String stockStateDesc) {
        this.stockStateDesc = stockStateDesc;
    }

    public String getStockStateDesc() {
        return stockStateDesc;
    }

    private Long skuId;
    private String areaId;
    private Long stockStateId;
    private String stockStateDesc;
}
