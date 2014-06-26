// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StockDetail.java

package com.jd.open.api.sdk.response.wms;

import java.io.Serializable;

public class StockDetail
        implements Serializable {

    public StockDetail() {
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    public int getStockQty() {
        return stockQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setPreemptionQty(int preemptionQty) {
        this.preemptionQty = preemptionQty;
    }

    public int getPreemptionQty() {
        return preemptionQty;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    private String goodsNo;
    private String warehouseNo;
    private int stockQty;
    private int availableQty;
    private int preemptionQty;
    private String goodsStatus;
}
