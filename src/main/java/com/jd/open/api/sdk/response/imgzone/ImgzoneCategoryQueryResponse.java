// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzoneCategoryQueryResponse.java

package com.jd.open.api.sdk.response.imgzone;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class ImgzoneCategoryQueryResponse extends AbstractResponse {

    public ImgzoneCategoryQueryResponse() {
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

    public void setCateList(List cateList) {
        this.cateList = cateList;
    }

    public List getCateList() {
        return cateList;
    }

    private int returnCode;
    private String desc;
    private List cateList;
}
