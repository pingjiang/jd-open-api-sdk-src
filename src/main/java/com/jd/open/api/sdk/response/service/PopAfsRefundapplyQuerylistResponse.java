// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PopAfsRefundapplyQuerylistResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.RefundapplySaf.RefundapplyResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopAfsRefundapplyQuerylistResponse extends AbstractResponse {

    public PopAfsRefundapplyQuerylistResponse() {
    }

    public void setRefundApplyResponse(RefundapplyResponse refundApplyResponse) {
        this.refundApplyResponse = refundApplyResponse;
    }

    public RefundapplyResponse getRefundApplyResponse() {
        return refundApplyResponse;
    }

    private RefundapplyResponse refundApplyResponse;
}
