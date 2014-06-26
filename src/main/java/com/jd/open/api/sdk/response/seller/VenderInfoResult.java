// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VenderInfoResult.java

package com.jd.open.api.sdk.response.seller;

import java.io.Serializable;

public class VenderInfoResult
        implements Serializable {

    public VenderInfoResult() {
    }

    public void setVenderId(Long venderId) {
        this.venderId = venderId;
    }

    public Long getVenderId() {
        return venderId;
    }

    public void setColType(Integer colType) {
        this.colType = colType;
    }

    public Integer getColType() {
        return colType;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setCateMain(Long cateMain) {
        this.cateMain = cateMain;
    }

    public Long getCateMain() {
        return cateMain;
    }

    private Long venderId;
    private Integer colType;
    private Long shopId;
    private String shopName;
    private Long cateMain;
}
