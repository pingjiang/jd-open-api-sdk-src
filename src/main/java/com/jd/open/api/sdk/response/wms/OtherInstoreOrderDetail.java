// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OtherInstoreOrderDetail.java

package com.jd.open.api.sdk.response.wms;

import java.io.Serializable;

public class OtherInstoreOrderDetail
        implements Serializable {

    public OtherInstoreOrderDetail() {
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setDifferenceRemark(String differenceRemark) {
        this.differenceRemark = differenceRemark;
    }

    public String getDifferenceRemark() {
        return differenceRemark;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getQty() {
        return qty;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    private String goodsNo;
    private String differenceRemark;
    private Integer qty;
    private String goodsStatus;
}
