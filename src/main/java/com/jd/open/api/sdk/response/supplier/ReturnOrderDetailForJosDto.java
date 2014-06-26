// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReturnOrderDetailForJosDto.java

package com.jd.open.api.sdk.response.supplier;

import java.io.Serializable;

public class ReturnOrderDetailForJosDto
        implements Serializable {

    public ReturnOrderDetailForJosDto() {
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityNum(int commodityNum) {
        this.commodityNum = commodityNum;
    }

    public int getCommodityNum() {
        return commodityNum;
    }

    private String skuId;
    private String commodityName;
    private int commodityNum;
}
