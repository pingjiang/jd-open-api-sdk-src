// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PriceChange.java

package com.jd.open.api.sdk.response.price;

import java.io.Serializable;

public class PriceChange
        implements Serializable {

    public PriceChange() {
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    private String skuId;
    private String price;
    private String marketPrice;
}
