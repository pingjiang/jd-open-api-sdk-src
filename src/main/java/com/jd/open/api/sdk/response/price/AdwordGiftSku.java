// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AdwordGiftSku.java

package com.jd.open.api.sdk.response.price;

import java.io.Serializable;

public class AdwordGiftSku
        implements Serializable {

    public AdwordGiftSku() {
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setGiftType(Integer giftType) {
        this.giftType = giftType;
    }

    public Integer getGiftType() {
        return giftType;
    }

    public void setGiftState(Integer giftState) {
        this.giftState = giftState;
    }

    public Integer getGiftState() {
        return giftState;
    }

    private String skuId;
    private String imagePath;
    private String name;
    private Integer number;
    private Integer giftType;
    private Integer giftState;
}
