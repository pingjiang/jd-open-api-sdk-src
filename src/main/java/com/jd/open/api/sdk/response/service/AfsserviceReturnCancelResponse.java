// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceReturnCancelResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade.ReturnCancelResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceReturnCancelResponse extends AbstractResponse {

    public AfsserviceReturnCancelResponse() {
    }

    public void setReturnCancelResult(ReturnCancelResult returnCancelResult) {
        this.returnCancelResult = returnCancelResult;
    }

    public ReturnCancelResult getReturnCancelResult() {
        return returnCancelResult;
    }

    private ReturnCancelResult returnCancelResult;
}
