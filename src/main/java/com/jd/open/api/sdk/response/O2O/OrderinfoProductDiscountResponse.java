// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderinfoProductDiscountResponse.java

package com.jd.open.api.sdk.response.O2O;

import java.io.Serializable;

public class OrderinfoProductDiscountResponse
        implements Serializable {

    public OrderinfoProductDiscountResponse() {
    }

    public void setCouponPrice(Double couponPrice) {
        this.couponPrice = couponPrice;
    }

    public Double getCouponPrice() {
        return couponPrice;
    }

    public void setCouponType(Byte couponType) {
        this.couponType = couponType;
    }

    public Byte getCouponType() {
        return couponType;
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

    private Double couponPrice;
    private Byte couponType;
    private String orderId;
    private String skuId;
}
