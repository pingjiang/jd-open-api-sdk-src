// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderDetailForJosDto.java

package com.jd.open.api.sdk.response.supplier;

import java.io.Serializable;

public class OrderDetailForJosDto
        implements Serializable {

    public OrderDetailForJosDto() {
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

    public void setCommodityNum(Integer commodityNum) {
        this.commodityNum = commodityNum;
    }

    public Integer getCommodityNum() {
        return commodityNum;
    }

    private String skuId;
    private String commodityName;
    private Integer commodityNum;
}
