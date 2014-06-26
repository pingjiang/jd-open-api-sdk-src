// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProcurementOrderCreateResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class ProcurementOrderCreateResponse extends AbstractResponse {

    public ProcurementOrderCreateResponse() {
    }

    public void setPurchaseOrderCodes(List purchaseOrderCodes) {
        this.purchaseOrderCodes = purchaseOrderCodes;
    }

    public List getPurchaseOrderCodes() {
        return purchaseOrderCodes;
    }

    private List purchaseOrderCodes;
}
