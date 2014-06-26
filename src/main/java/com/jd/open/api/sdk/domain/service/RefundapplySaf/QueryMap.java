// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryMap.java

package com.jd.open.api.sdk.domain.service.RefundapplySaf;

import java.io.Serializable;

public class QueryMap
        implements Serializable {

    public QueryMap() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyRefundSum(String applyRefundSum) {
        this.applyRefundSum = applyRefundSum;
    }

    public String getApplyRefundSum() {
        return applyRefundSum;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setCheckUsername(String checkUsername) {
        this.checkUsername = checkUsername;
    }

    public String getCheckUsername() {
        return checkUsername;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    private String id;
    private String buyerId;
    private String buyerName;
    private String checkTime;
    private String applyTime;
    private String applyRefundSum;
    private String status;
    private String checkUsername;
    private String orderId;
}
