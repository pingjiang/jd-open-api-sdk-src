// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderPrintDataWare.java

package com.jd.open.api.sdk.domain.order;


public class OrderPrintDataWare {

    public OrderPrintDataWare() {
    }

    public String getProduceNo() {
        return produceNo;
    }

    public void setProduceNo(String produceNo) {
        this.produceNo = produceNo;
    }

    public String getWareId() {
        return wareId;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    public String getWareName() {
        return wareName;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getJdPrice() {
        return jdPrice;
    }

    public void setJdPrice(String jdPrice) {
        this.jdPrice = jdPrice;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private String wareId;
    private String wareName;
    private String num;
    private String jdPrice;
    private String price;
    private String produceNo;
}
