// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderinfoProductResponse.java

package com.jd.open.api.sdk.response.O2O;

import java.io.Serializable;

public class OrderinfoProductResponse
        implements Serializable {

    public OrderinfoProductResponse() {
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setOuterSkuId(String outerSkuId) {
        this.outerSkuId = outerSkuId;
    }

    public String getOuterSkuId() {
        return outerSkuId;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setJdPrice(Double jdPrice) {
        this.jdPrice = jdPrice;
    }

    public Double getJdPrice() {
        return jdPrice;
    }

    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    public Integer getGiftPoint() {
        return giftPoint;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    public String getWareId() {
        return wareId;
    }

    public void setItemTotal(Integer itemTotal) {
        this.itemTotal = itemTotal;
    }

    public Integer getItemTotal() {
        return itemTotal;
    }

    public void setStockOwner(String stockOwner) {
        this.stockOwner = stockOwner;
    }

    public String getStockOwner() {
        return stockOwner;
    }

    private String orderId;
    private String skuId;
    private String outerSkuId;
    private String skuName;
    private Double jdPrice;
    private Integer giftPoint;
    private String wareId;
    private Integer itemTotal;
    private String stockOwner;
}
