// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceMajorcategoryGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceConfFacade.PublicResultObjectMajorCategory;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceMajorcategoryGetResponse extends AbstractResponse {

    public AfsserviceMajorcategoryGetResponse() {
    }

    public void setPublicResultObject(PublicResultObjectMajorCategory publicResultObject) {
        this.publicResultObject = publicResultObject;
    }

    public PublicResultObjectMajorCategory getPublicResultObject() {
        return publicResultObject;
    }

    private PublicResultObjectMajorCategory publicResultObject;
}
