// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AdwordCoupon.java

package com.jd.open.api.sdk.response.price;

import java.io.Serializable;

public class AdwordCoupon
        implements Serializable {

    public AdwordCoupon() {
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setCouponQouta(Integer couponQouta) {
        this.couponQouta = couponQouta;
    }

    public Integer getCouponQouta() {
        return couponQouta;
    }

    private Integer type;
    private String key;
    private Integer couponQouta;
}
