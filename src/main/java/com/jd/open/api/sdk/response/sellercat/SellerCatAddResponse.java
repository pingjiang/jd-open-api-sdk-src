// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerCatAddResponse.java

package com.jd.open.api.sdk.response.sellercat;

import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerCatAddResponse extends AbstractResponse {

    public SellerCatAddResponse() {
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    private String createTime;
    private String cid;
}
