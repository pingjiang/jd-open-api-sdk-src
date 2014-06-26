// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareSkuUpdateResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

public class WareSkuUpdateResponse extends AbstractResponse {

    public WareSkuUpdateResponse() {
    }

    public WareSkuUpdateResponse(String modified, String skuId) {
        this.modified = modified;
        this.skuId = skuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    private static final long serialVersionUID = 0xb245594fL;
    private String modified;
    private String skuId;
}
