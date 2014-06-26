// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerCatUpdateResponse.java

package com.jd.open.api.sdk.response.sellercat;

import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerCatUpdateResponse extends AbstractResponse {

    public SellerCatUpdateResponse() {
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    private String modified;
    private String cid;
}
