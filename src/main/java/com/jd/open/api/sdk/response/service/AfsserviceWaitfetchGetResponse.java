// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceWaitfetchGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade.PublicResultObjectWaitFetch;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceWaitfetchGetResponse extends AbstractResponse {

    public AfsserviceWaitfetchGetResponse() {
    }

    public void setPublicResultObject(PublicResultObjectWaitFetch publicResultObject) {
        this.publicResultObject = publicResultObject;
    }

    public PublicResultObjectWaitFetch getPublicResultObject() {
        return publicResultObject;
    }

    private PublicResultObjectWaitFetch publicResultObject;
}
