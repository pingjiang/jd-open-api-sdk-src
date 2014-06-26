// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Product.java

package com.jd.open.api.sdk.response.recommend;

import java.io.Serializable;

public class Product
        implements Serializable {

    public Product() {
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuPicUrl(String skuPicUrl) {
        this.skuPicUrl = skuPicUrl;
    }

    public String getSkuPicUrl() {
        return skuPicUrl;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuName() {
        return skuName;
    }

    private Integer skuId;
    private String skuPicUrl;
    private String skuName;
}
