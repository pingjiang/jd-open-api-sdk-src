// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PacksList.java

package com.jd.open.api.sdk.response.recommend;

import java.io.Serializable;
import java.util.List;

public class PacksList
        implements Serializable {

    public PacksList() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setImageDomain(String imageDomain) {
        this.imageDomain = imageDomain;
    }

    public String getImageDomain() {
        return imageDomain;
    }

    public void setData(List data) {
        this.data = data;
    }

    public List getData() {
        return data;
    }

    private Integer resultCode;
    private String imageDomain;
    private List data;
}
