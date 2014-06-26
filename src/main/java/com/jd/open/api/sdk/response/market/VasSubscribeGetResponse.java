// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VasSubscribeGetResponse.java

package com.jd.open.api.sdk.response.market;

import com.jd.open.api.sdk.response.AbstractResponse;

public class VasSubscribeGetResponse extends AbstractResponse {

    public VasSubscribeGetResponse() {
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return endDate;
    }

    private String itemCode;
    private String endDate;
}
