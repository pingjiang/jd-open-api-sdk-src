// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Packs.java

package com.jd.open.api.sdk.response.recommend;

import java.io.Serializable;
import java.util.List;

public class Packs
        implements Serializable {

    public Packs() {
    }

    public void setPackListPrice(String packListPrice) {
        this.packListPrice = packListPrice;
    }

    public String getPackListPrice() {
        return packListPrice;
    }

    public void setPackPrice(String packPrice) {
        this.packPrice = packPrice;
    }

    public String getPackPrice() {
        return packPrice;
    }

    public void setMainSkuPicUrl(String mainSkuPicUrl) {
        this.mainSkuPicUrl = mainSkuPicUrl;
    }

    public String getMainSkuPicUrl() {
        return mainSkuPicUrl;
    }

    public void setPackId(String packId) {
        this.packId = packId;
    }

    public String getPackId() {
        return packId;
    }

    public void setMainSkuId(String mainSkuId) {
        this.mainSkuId = mainSkuId;
    }

    public String getMainSkuId() {
        return mainSkuId;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getDiscount() {
        return discount;
    }

    public void setMainSkuName(String mainSkuName) {
        this.mainSkuName = mainSkuName;
    }

    public String getMainSkuName() {
        return mainSkuName;
    }

    public void setPacks(List packs) {
        this.packs = packs;
    }

    public List getPacks() {
        return packs;
    }

    private String packListPrice;
    private String packPrice;
    private String mainSkuPicUrl;
    private String packId;
    private String mainSkuId;
    private String discount;
    private String mainSkuName;
    private List packs;
}
