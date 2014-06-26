// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProductCatelogyList.java

package com.jd.open.api.sdk.response.list;

import java.io.Serializable;
import java.util.List;

public class ProductCatelogyList
        implements Serializable {

    public ProductCatelogyList() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setCatelogyList(List catelogyList) {
        this.catelogyList = catelogyList;
    }

    public List getCatelogyList() {
        return catelogyList;
    }

    private Integer resultCode;
    private List catelogyList;
}
