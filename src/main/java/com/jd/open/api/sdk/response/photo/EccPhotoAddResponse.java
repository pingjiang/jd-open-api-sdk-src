// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccPhotoAddResponse.java

package com.jd.open.api.sdk.response.photo;

import com.jd.open.api.sdk.request.photo.PhotoProxyResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EccPhotoAddResponse extends AbstractResponse {

    public EccPhotoAddResponse() {
    }

    public PhotoProxyResult getPhotoProxyResult() {
        return photoProxyResult;
    }

    public void setPhotoProxyResult(PhotoProxyResult photoProxyResult) {
        this.photoProxyResult = photoProxyResult;
    }

    private PhotoProxyResult photoProxyResult;
}
