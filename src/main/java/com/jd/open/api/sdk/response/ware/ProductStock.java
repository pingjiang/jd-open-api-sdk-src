// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProductStock.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;

public class ProductStock
        implements Serializable {

    public ProductStock() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    private Integer resultCode;
    private Boolean flag;
    private String stockStatus;
}
