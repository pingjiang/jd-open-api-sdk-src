// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SkuJdPriceGetResponse.java

package com.jd.open.api.sdk.response.website.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

public class SkuJdPriceGetResponse extends AbstractResponse {

    public SkuJdPriceGetResponse() {
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getJdPrice() {
        return jdPrice;
    }

    public void setJdPrice(String jdPrice) {
        this.jdPrice = jdPrice;
    }

    private String skuId;
    private String jdPrice;
}
