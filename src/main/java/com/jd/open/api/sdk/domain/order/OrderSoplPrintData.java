// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderSoplPrintData.java

package com.jd.open.api.sdk.domain.order;


// Referenced classes of package com.jd.open.api.sdk.domain.order:
//            OrderPrintData

public class OrderSoplPrintData extends OrderPrintData {

    public OrderSoplPrintData() {
    }

    public String getOrderLevelSign() {
        return orderLevelSign;
    }

    public void setOrderLevelSign(String orderLevelSign) {
        this.orderLevelSign = orderLevelSign;
    }

    public int getOrderLevelType() {
        return orderLevelType;
    }

    public void setOrderLevelType(int orderLevelType) {
        this.orderLevelType = orderLevelType;
    }

    public String getPickUpSign() {
        return pickUpSign;
    }

    public void setPickUpSign(String pickUpSign) {
        this.pickUpSign = pickUpSign;
    }

    public int getPickUpSignType() {
        return pickUpSignType;
    }

    public void setPickUpSignType(int pickUpSignType) {
        this.pickUpSignType = pickUpSignType;
    }

    private String pickUpSign;
    private int pickUpSignType;
    private String orderLevelSign;
    private int orderLevelType;
}
