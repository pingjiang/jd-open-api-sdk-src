// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceUnpackinginfoGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade.PublicResultObjectUnpackingInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceUnpackinginfoGetResponse extends AbstractResponse {

    public AfsserviceUnpackinginfoGetResponse() {
    }

    public void setPublicResultObject(PublicResultObjectUnpackingInfo publicResultObject) {
        this.publicResultObject = publicResultObject;
    }

    public PublicResultObjectUnpackingInfo getPublicResultObject() {
        return publicResultObject;
    }

    private PublicResultObjectUnpackingInfo publicResultObject;
}
