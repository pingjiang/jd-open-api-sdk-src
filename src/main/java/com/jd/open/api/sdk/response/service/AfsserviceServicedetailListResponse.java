// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceServicedetailListResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PublicResultListAfsServiceDetail

public class AfsserviceServicedetailListResponse extends AbstractResponse {

    public AfsserviceServicedetailListResponse() {
    }

    public void setPublicResultList(PublicResultListAfsServiceDetail publicResultList) {
        this.publicResultList = publicResultList;
    }

    public PublicResultListAfsServiceDetail getPublicResultList() {
        return publicResultList;
    }

    private PublicResultListAfsServiceDetail publicResultList;
}
