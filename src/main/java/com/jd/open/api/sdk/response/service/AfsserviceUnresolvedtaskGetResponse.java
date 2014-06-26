// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceUnresolvedtaskGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PublicResultObjectUnresolvedTask

public class AfsserviceUnresolvedtaskGetResponse extends AbstractResponse {

    public AfsserviceUnresolvedtaskGetResponse() {
    }

    public void setPublicResultObject(PublicResultObjectUnresolvedTask publicResultObject) {
        this.publicResultObject = publicResultObject;
    }

    public PublicResultObjectUnresolvedTask getPublicResultObject() {
        return publicResultObject;
    }

    private PublicResultObjectUnresolvedTask publicResultObject;
}
