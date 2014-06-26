// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VcStockSalesDetailGetResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class VcStockSalesDetailGetResponse extends AbstractResponse {

    public VcStockSalesDetailGetResponse() {
    }

    public void setArg43(List arg43) {
        this.arg43 = arg43;
    }

    public List getArg43() {
        return arg43;
    }

    private List arg43;
}
