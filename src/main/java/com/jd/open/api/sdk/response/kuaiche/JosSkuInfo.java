// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JosSkuInfo.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;

public class JosSkuInfo
        implements Serializable {

    public JosSkuInfo() {
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public long getSkuId() {
        return skuId;
    }

    public void setSkuUrl(String skuUrl) {
        this.skuUrl = skuUrl;
    }

    public String getSkuUrl() {
        return skuUrl;
    }

    private long skuId;
    private String skuUrl;
}
