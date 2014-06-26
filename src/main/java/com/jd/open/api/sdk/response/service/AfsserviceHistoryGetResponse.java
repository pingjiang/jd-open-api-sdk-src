// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceHistoryGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade.PublicResultListAfsServiceHistory;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceHistoryGetResponse extends AbstractResponse {

    public AfsserviceHistoryGetResponse() {
    }

    public void setPublicResultList(PublicResultListAfsServiceHistory publicResultList) {
        this.publicResultList = publicResultList;
    }

    public PublicResultListAfsServiceHistory getPublicResultList() {
        return publicResultList;
    }

    private PublicResultListAfsServiceHistory publicResultList;
}
