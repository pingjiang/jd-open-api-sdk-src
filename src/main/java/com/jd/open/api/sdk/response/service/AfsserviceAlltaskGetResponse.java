// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceAlltaskGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PublicResultObjectAllTask

public class AfsserviceAlltaskGetResponse extends AbstractResponse {

    public AfsserviceAlltaskGetResponse() {
    }

    public void setPublicResultObject(PublicResultObjectAllTask publicResultObject) {
        this.publicResultObject = publicResultObject;
    }

    public PublicResultObjectAllTask getPublicResultObject() {
        return publicResultObject;
    }

    private PublicResultObjectAllTask publicResultObject;
}
