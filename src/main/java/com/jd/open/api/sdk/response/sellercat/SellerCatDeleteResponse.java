// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerCatDeleteResponse.java

package com.jd.open.api.sdk.response.sellercat;

import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerCatDeleteResponse extends AbstractResponse {

    public SellerCatDeleteResponse() {
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    private long cid;
    private String created;
}
