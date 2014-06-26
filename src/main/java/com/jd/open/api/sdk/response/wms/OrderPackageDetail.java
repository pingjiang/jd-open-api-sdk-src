// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderPackageDetail.java

package com.jd.open.api.sdk.response.wms;

import java.io.Serializable;

public class OrderPackageDetail
        implements Serializable {

    public OrderPackageDetail() {
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setCarriersId(String carriersId) {
        this.carriersId = carriersId;
    }

    public String getCarriersId() {
        return carriersId;
    }

    public void setCarriersName(String carriersName) {
        this.carriersName = carriersName;
    }

    public String getCarriersName() {
        return carriersName;
    }

    private String weight;
    private String deliveryNo;
    private String carriersId;
    private String carriersName;
}
