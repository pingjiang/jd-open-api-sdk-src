// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzonePictureQueryResponse.java

package com.jd.open.api.sdk.response.imgzone;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class ImgzonePictureQueryResponse extends AbstractResponse {

    public ImgzonePictureQueryResponse() {
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

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setImgList(List imgList) {
        this.imgList = imgList;
    }

    public List getImgList() {
        return imgList;
    }

    private Integer returnCode;
    private String desc;
    private Integer totalNum;
    private List imgList;
}
