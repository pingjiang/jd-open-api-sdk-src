// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PopAfsRefundapplyQuerybyidResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.RefundapplySaf.RefundapplyResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopAfsRefundapplyQuerybyidResponse extends AbstractResponse {

    public PopAfsRefundapplyQuerybyidResponse() {
    }

    public void setRefundapplyResponse(RefundapplyResponse refundapplyResponse) {
        this.refundapplyResponse = refundapplyResponse;
    }

    public RefundapplyResponse getRefundapplyResponse() {
        return refundapplyResponse;
    }

    private RefundapplyResponse refundapplyResponse;
}
