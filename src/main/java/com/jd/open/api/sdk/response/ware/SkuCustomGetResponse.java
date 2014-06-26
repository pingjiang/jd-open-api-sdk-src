// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SkuCustomGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.domain.ware.Sku;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SkuCustomGetResponse extends AbstractResponse {

    public SkuCustomGetResponse() {
    }

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    private Sku sku;
}
