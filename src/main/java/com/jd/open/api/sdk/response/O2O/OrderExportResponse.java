// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderExportResponse.java

package com.jd.open.api.sdk.response.O2O;

import java.io.Serializable;

public class OrderExportResponse
        implements Serializable {

    public OrderExportResponse() {
    }

    public void setProcessCode(int processCode) {
        this.processCode = processCode;
    }

    public int getProcessCode() {
        return processCode;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public String getVenderId() {
        return venderId;
    }

    public void setOrderUpdateTime(String orderUpdateTime) {
        this.orderUpdateTime = orderUpdateTime;
    }

    public String getOrderUpdateTime() {
        return orderUpdateTime;
    }

    private int processCode;
    private String processStatus;
    private String errorMessage;
    private String orderId;
    private String venderId;
    private String orderUpdateTime;
}
