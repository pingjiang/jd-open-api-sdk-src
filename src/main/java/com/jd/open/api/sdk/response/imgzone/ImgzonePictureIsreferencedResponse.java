// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzonePictureIsreferencedResponse.java

package com.jd.open.api.sdk.response.imgzone;

import com.jd.open.api.sdk.response.AbstractResponse;

public class ImgzonePictureIsreferencedResponse extends AbstractResponse {

    public ImgzonePictureIsreferencedResponse() {
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

    public void setIsReferenced(boolean isReferenced) {
        this.isReferenced = isReferenced;
    }

    public boolean getIsReferenced() {
        return isReferenced;
    }

    private int returnCode;
    private String desc;
    private boolean isReferenced;
}
