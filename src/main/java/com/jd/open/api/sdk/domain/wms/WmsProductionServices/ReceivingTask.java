// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReceivingTask.java

package com.jd.open.api.sdk.domain.wms.WmsProductionServices;

import java.io.Serializable;

public class ReceivingTask
        implements Serializable {

    public ReceivingTask() {
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public void setExpectedQty(int expectedQty) {
        this.expectedQty = expectedQty;
    }

    public int getExpectedQty() {
        return expectedQty;
    }

    public void setDifferenceRemark(String differenceRemark) {
        this.differenceRemark = differenceRemark;
    }

    public String getDifferenceRemark() {
        return differenceRemark;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBarCode() {
        return barCode;
    }

    private String goodsNo;
    private String goodsStatus;
    private int qty;
    private int expectedQty;
    private String differenceRemark;
    private String barCode;
}
