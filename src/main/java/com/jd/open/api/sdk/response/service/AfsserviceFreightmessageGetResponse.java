// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceFreightmessageGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PublicResultObjectAfsFreight

public class AfsserviceFreightmessageGetResponse extends AbstractResponse {

    public AfsserviceFreightmessageGetResponse() {
    }

    public void setPublicResultObject(PublicResultObjectAfsFreight publicResultObject) {
        this.publicResultObject = publicResultObject;
    }

    public PublicResultObjectAfsFreight getPublicResultObject() {
        return publicResultObject;
    }

    private PublicResultObjectAfsFreight publicResultObject;
}
