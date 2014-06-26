// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ResponseOrderOtherDetail.java

package com.jd.open.api.sdk.domain.wms.WmsProductionServices;

import java.io.Serializable;

public class ResponseOrderOtherDetail
        implements Serializable {

    public ResponseOrderOtherDetail() {
    }

    public void setJoslGoodNo(String joslGoodNo) {
        this.joslGoodNo = joslGoodNo;
    }

    public String getJoslGoodNo() {
        return joslGoodNo;
    }

    public void setIsvGoodNo(String isvGoodNo) {
        this.isvGoodNo = isvGoodNo;
    }

    public String getIsvGoodNo() {
        return isvGoodNo;
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

    private String joslGoodNo;
    private String isvGoodNo;
    private Integer qty;
    private String goodsStatus;
    private String differenceRemark;
    private String barCode;
}
