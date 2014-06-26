// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProductSkuList.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;
import java.util.List;

public class ProductSkuList
        implements Serializable {

    public ProductSkuList() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setSkuSize(List skuSize) {
        this.skuSize = skuSize;
    }

    public List getSkuSize() {
        return skuSize;
    }

    public void setSkuColor(List skuColor) {
        this.skuColor = skuColor;
    }

    public List getSkuColor() {
        return skuColor;
    }

    private Integer resultCode;
    private List skuSize;
    private List skuColor;
}
