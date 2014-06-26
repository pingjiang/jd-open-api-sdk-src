// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceMessagesystemGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade.PublicResultListMessageSystemInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceMessagesystemGetResponse extends AbstractResponse {

    public AfsserviceMessagesystemGetResponse() {
    }

    public void setPublicResultList(PublicResultListMessageSystemInfo publicResultList) {
        this.publicResultList = publicResultList;
    }

    public PublicResultListMessageSystemInfo getPublicResultList() {
        return publicResultList;
    }

    private PublicResultListMessageSystemInfo publicResultList;
}
