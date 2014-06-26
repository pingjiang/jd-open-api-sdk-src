// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceReceivetaskGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PublicResultObjectReceiveTask

public class AfsserviceReceivetaskGetResponse extends AbstractResponse {

    public AfsserviceReceivetaskGetResponse() {
    }

    public void setPublicResultObject(PublicResultObjectReceiveTask publicResultObject) {
        this.publicResultObject = publicResultObject;
    }

    public PublicResultObjectReceiveTask getPublicResultObject() {
        return publicResultObject;
    }

    private PublicResultObjectReceiveTask publicResultObject;
}
