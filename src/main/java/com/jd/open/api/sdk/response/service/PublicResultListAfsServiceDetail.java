// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultListAfsServiceDetail.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;
import java.util.List;

public class PublicResultListAfsServiceDetail
        implements Serializable {

    public PublicResultListAfsServiceDetail() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setModelList(List modelList) {
        this.modelList = modelList;
    }

    public List getModelList() {
        return modelList;
    }

    private Integer resultCode;
    private List modelList;
}
