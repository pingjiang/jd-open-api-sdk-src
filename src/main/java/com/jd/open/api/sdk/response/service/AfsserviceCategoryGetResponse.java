// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceCategoryGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceConfFacade.PublicResultObjectAfsCategory;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceCategoryGetResponse extends AbstractResponse {

    public AfsserviceCategoryGetResponse() {
    }

    public void setPublicResultObject(PublicResultObjectAfsCategory publicResultObject) {
        this.publicResultObject = publicResultObject;
    }

    public PublicResultObjectAfsCategory getPublicResultObject() {
        return publicResultObject;
    }

    private PublicResultObjectAfsCategory publicResultObject;
}
