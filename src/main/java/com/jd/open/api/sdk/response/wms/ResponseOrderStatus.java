// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ResponseOrderStatus.java

package com.jd.open.api.sdk.response.wms;

import java.io.Serializable;
import java.util.List;

public class ResponseOrderStatus
        implements Serializable {

    public ResponseOrderStatus() {
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setOrderStatusDetails(List orderStatusDetails) {
        this.orderStatusDetails = orderStatusDetails;
    }

    public List getOrderStatusDetails() {
        return orderStatusDetails;
    }

    public void setOrderPackageDetails(List orderPackageDetails) {
        this.orderPackageDetails = orderPackageDetails;
    }

    public List getOrderPackageDetails() {
        return orderPackageDetails;
    }

    private String receiptNo;
    private List orderStatusDetails;
    private List orderPackageDetails;
}
