// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VcStockSalesGetResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class VcStockSalesGetResponse extends AbstractResponse {

    public VcStockSalesGetResponse() {
    }

    public void setArg36(List arg36) {
        this.arg36 = arg36;
    }

    public List getArg36() {
        return arg36;
    }

    private List arg36;
}
