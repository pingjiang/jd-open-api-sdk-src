// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderStatusDetail.java

package com.jd.open.api.sdk.response.wms;

import java.io.Serializable;

public class OrderStatusDetail
        implements Serializable {

    public OrderStatusDetail() {
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    private int status;
    private String statusName;
    private String completeTime;
}
