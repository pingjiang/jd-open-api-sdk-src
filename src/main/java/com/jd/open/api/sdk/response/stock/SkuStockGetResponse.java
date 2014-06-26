// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SkuStockGetResponse.java

package com.jd.open.api.sdk.response.stock;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class SkuStockGetResponse extends AbstractResponse {

    public SkuStockGetResponse() {
    }

    public void setStockStatus(List stockStatus) {
        this.stockStatus = stockStatus;
    }

    public List getStockStatus() {
        return stockStatus;
    }

    private List stockStatus;
}
