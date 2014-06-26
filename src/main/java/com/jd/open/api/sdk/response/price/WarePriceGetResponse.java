// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WarePriceGetResponse.java

package com.jd.open.api.sdk.response.price;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WarePriceGetResponse extends AbstractResponse {

    public WarePriceGetResponse() {
    }

    public void setPriceChanges(List priceChanges) {
        this.priceChanges = priceChanges;
    }

    public List getPriceChanges() {
        return priceChanges;
    }

    private List priceChanges;
}
