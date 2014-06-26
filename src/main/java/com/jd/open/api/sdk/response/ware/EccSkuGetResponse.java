// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccSkuGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.request.ware.ItemSkuResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EccSkuGetResponse extends AbstractResponse {

    public EccSkuGetResponse() {
    }

    public void setItemSkuResult(ItemSkuResult itemSkuResult) {
        this.itemSkuResult = itemSkuResult;
    }

    public ItemSkuResult getItemSkuResult() {
        return itemSkuResult;
    }

    private ItemSkuResult itemSkuResult;
}
