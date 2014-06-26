// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzonePictureUploadResponse.java

package com.jd.open.api.sdk.response.imgzone;

import com.jd.open.api.sdk.response.AbstractResponse;

public class ImgzonePictureUploadResponse extends AbstractResponse {

    public ImgzonePictureUploadResponse() {
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    private int returnCode;
    private String desc;
    private String pictureId;
    private String pictureUrl;
}
