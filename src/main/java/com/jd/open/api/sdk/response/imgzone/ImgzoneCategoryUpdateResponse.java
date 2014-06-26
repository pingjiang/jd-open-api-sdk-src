// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzoneCategoryUpdateResponse.java

package com.jd.open.api.sdk.response.imgzone;

import com.jd.open.api.sdk.response.AbstractResponse;

public class ImgzoneCategoryUpdateResponse extends AbstractResponse {

    public ImgzoneCategoryUpdateResponse() {
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    private Integer returnCode;
    private String desc;
}
