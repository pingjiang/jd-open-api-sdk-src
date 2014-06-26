// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceRefundinfoGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade.PublicResultObjectRefundInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceRefundinfoGetResponse extends AbstractResponse {

    public AfsserviceRefundinfoGetResponse() {
    }

    public void setPublicResultObject(PublicResultObjectRefundInfo publicResultObject) {
        this.publicResultObject = publicResultObject;
    }

    public PublicResultObjectRefundInfo getPublicResultObject() {
        return publicResultObject;
    }

    private PublicResultObjectRefundInfo publicResultObject;
}
