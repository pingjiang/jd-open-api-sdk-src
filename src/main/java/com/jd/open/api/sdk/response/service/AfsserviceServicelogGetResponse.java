// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceServicelogGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PublicResultObjectAfsLog

public class AfsserviceServicelogGetResponse extends AbstractResponse {

    public AfsserviceServicelogGetResponse() {
    }

    public void setPublicResultObject(PublicResultObjectAfsLog publicResultObject) {
        this.publicResultObject = publicResultObject;
    }

    public PublicResultObjectAfsLog getPublicResultObject() {
        return publicResultObject;
    }

    private PublicResultObjectAfsLog publicResultObject;
}
