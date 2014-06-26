// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceFinishedtaskGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PublicResultObjectFinishedTask

public class AfsserviceFinishedtaskGetResponse extends AbstractResponse {

    public AfsserviceFinishedtaskGetResponse() {
    }

    public void setPublicResultObject(PublicResultObjectFinishedTask publicResultObject) {
        this.publicResultObject = publicResultObject;
    }

    public PublicResultObjectFinishedTask getPublicResultObject() {
        return publicResultObject;
    }

    private PublicResultObjectFinishedTask publicResultObject;
}
