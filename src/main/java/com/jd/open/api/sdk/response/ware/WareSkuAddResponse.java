// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareSkuAddResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

public class WareSkuAddResponse extends AbstractResponse {

    public WareSkuAddResponse() {
    }

    public WareSkuAddResponse(String created, String skuId) {
        this.created = created;
        this.skuId = skuId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    private static final long serialVersionUID = 0x1044758fL;
    private String created;
    private String skuId;
}
