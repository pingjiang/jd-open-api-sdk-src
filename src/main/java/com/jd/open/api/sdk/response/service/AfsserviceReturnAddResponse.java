// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceReturnAddResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade.ReturnAddResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceReturnAddResponse extends AbstractResponse {

    public AfsserviceReturnAddResponse() {
    }

    public void setReturnAddResult(ReturnAddResult returnAddResult) {
        this.returnAddResult = returnAddResult;
    }

    public ReturnAddResult getReturnAddResult() {
        return returnAddResult;
    }

    private ReturnAddResult returnAddResult;
}
