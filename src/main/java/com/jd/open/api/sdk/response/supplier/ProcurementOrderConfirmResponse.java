// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProcurementOrderConfirmResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.response.AbstractResponse;

public class ProcurementOrderConfirmResponse extends AbstractResponse {

    public ProcurementOrderConfirmResponse() {
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Boolean getResult() {
        return result;
    }

    private Boolean result;
}
