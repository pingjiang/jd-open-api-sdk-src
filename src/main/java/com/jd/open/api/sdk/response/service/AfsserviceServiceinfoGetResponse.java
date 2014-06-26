// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceServiceinfoGetResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PublicResultObjectAfsService

public class AfsserviceServiceinfoGetResponse extends AbstractResponse {

    public AfsserviceServiceinfoGetResponse() {
    }

    public void setPublicResultObject(PublicResultObjectAfsService publicResultObject) {
        this.publicResultObject = publicResultObject;
    }

    public PublicResultObjectAfsService getPublicResultObject() {
        return publicResultObject;
    }

    private PublicResultObjectAfsService publicResultObject;
}
