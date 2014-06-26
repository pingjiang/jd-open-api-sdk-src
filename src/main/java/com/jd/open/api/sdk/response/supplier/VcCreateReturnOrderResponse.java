// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VcCreateReturnOrderResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class VcCreateReturnOrderResponse extends AbstractResponse {

    public VcCreateReturnOrderResponse() {
    }

    public void setReturnOrderIds(List returnOrderIds) {
        this.returnOrderIds = returnOrderIds;
    }

    public List getReturnOrderIds() {
        return returnOrderIds;
    }

    private List returnOrderIds;
}
