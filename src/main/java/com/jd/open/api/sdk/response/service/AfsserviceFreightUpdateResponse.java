// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceFreightUpdateResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade.AfsFreightUpdateResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceFreightUpdateResponse extends AbstractResponse {

    public AfsserviceFreightUpdateResponse() {
    }

    public void setAfsFreightUpdateResult(AfsFreightUpdateResult afsFreightUpdateResult) {
        this.afsFreightUpdateResult = afsFreightUpdateResult;
    }

    public AfsFreightUpdateResult getAfsFreightUpdateResult() {
        return afsFreightUpdateResult;
    }

    private AfsFreightUpdateResult afsFreightUpdateResult;
}
