// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceRemarkAddResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade.AfsServiceRemarkAddResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceRemarkAddResponse extends AbstractResponse {

    public AfsserviceRemarkAddResponse() {
    }

    public void setAfsServiceRemarkAddResult(AfsServiceRemarkAddResult afsServiceRemarkAddResult) {
        this.afsServiceRemarkAddResult = afsServiceRemarkAddResult;
    }

    public AfsServiceRemarkAddResult getAfsServiceRemarkAddResult() {
        return afsServiceRemarkAddResult;
    }

    private AfsServiceRemarkAddResult afsServiceRemarkAddResult;
}
