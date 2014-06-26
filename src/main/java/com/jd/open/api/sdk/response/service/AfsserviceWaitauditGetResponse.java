// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceWaitauditGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade.PublicResultObjectWaitAuditTask;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceWaitauditGetResponse extends AbstractResponse {

    public AfsserviceWaitauditGetResponse() {
    }

    public void setPublicResultObject(PublicResultObjectWaitAuditTask publicResultObject) {
        this.publicResultObject = publicResultObject;
    }

    public PublicResultObjectWaitAuditTask getPublicResultObject() {
        return publicResultObject;
    }

    private PublicResultObjectWaitAuditTask publicResultObject;
}
