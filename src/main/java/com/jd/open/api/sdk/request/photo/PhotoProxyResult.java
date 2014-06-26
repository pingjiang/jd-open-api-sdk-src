// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PhotoProxyResult.java

package com.jd.open.api.sdk.request.photo;

import java.io.Serializable;

public class PhotoProxyResult
        implements Serializable {

    public PhotoProxyResult() {
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    private String pictureUrl;
}
