// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzonePictureDeleteResponse.java

package com.jd.open.api.sdk.response.imgzone;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class ImgzonePictureDeleteResponse extends AbstractResponse {

    public ImgzonePictureDeleteResponse() {
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

    public void setSuccessNum(int successNum) {
        this.successNum = successNum;
    }

    public int getSuccessNum() {
        return successNum;
    }

    public void setIllegal(List illegal) {
        this.illegal = illegal;
    }

    public List getIllegal() {
        return illegal;
    }

    public void setReferenced(List referenced) {
        this.referenced = referenced;
    }

    public List getReferenced() {
        return referenced;
    }

    public void setFail(List fail) {
        this.fail = fail;
    }

    public List getFail() {
        return fail;
    }

    private int returnCode;
    private String desc;
    private int successNum;
    private List illegal;
    private List referenced;
    private List fail;
}
