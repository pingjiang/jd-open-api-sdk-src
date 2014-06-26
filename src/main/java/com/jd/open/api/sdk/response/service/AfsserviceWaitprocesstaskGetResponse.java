// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceWaitprocesstaskGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PublicResultObjectWaitProcessTask

public class AfsserviceWaitprocesstaskGetResponse extends AbstractResponse {

    public AfsserviceWaitprocesstaskGetResponse() {
    }

    public void setPublicResultObject(PublicResultObjectWaitProcessTask publicResultObject) {
        this.publicResultObject = publicResultObject;
    }

    public PublicResultObjectWaitProcessTask getPublicResultObject() {
        return publicResultObject;
    }

    private PublicResultObjectWaitProcessTask publicResultObject;
}
