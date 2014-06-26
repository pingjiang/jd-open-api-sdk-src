// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceCustomerfeedbackTransferResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade.CustomerFeedbackTransferResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceCustomerfeedbackTransferResponse extends AbstractResponse {

    public AfsserviceCustomerfeedbackTransferResponse() {
    }

    public void setCustomerFeedbackTransferResult(CustomerFeedbackTransferResult customerFeedbackTransferResult) {
        this.customerFeedbackTransferResult = customerFeedbackTransferResult;
    }

    public CustomerFeedbackTransferResult getCustomerFeedbackTransferResult() {
        return customerFeedbackTransferResult;
    }

    private CustomerFeedbackTransferResult customerFeedbackTransferResult;
}
