// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceAuditRejectResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade.AfsServiceAuditRejectResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceAuditRejectResponse extends AbstractResponse {

    public AfsserviceAuditRejectResponse() {
    }

    public void setAfsServiceAuditRejectResult(AfsServiceAuditRejectResult afsServiceAuditRejectResult) {
        this.afsServiceAuditRejectResult = afsServiceAuditRejectResult;
    }

    public AfsServiceAuditRejectResult getAfsServiceAuditRejectResult() {
        return afsServiceAuditRejectResult;
    }

    private AfsServiceAuditRejectResult afsServiceAuditRejectResult;
}
