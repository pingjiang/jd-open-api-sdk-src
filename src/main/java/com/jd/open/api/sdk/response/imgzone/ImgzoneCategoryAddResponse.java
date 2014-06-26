// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzoneCategoryAddResponse.java

package com.jd.open.api.sdk.response.imgzone;

import com.jd.open.api.sdk.response.AbstractResponse;

public class ImgzoneCategoryAddResponse extends AbstractResponse {

    public ImgzoneCategoryAddResponse() {
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

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getCateId() {
        return cateId;
    }

    private Integer returnCode;
    private String desc;
    private Integer cateId;
}
