// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsServiceHistory.java

package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade;

import java.io.Serializable;
import java.util.Date;

public class AfsServiceHistory
        implements Serializable {

    public AfsServiceHistory() {
    }

    public void setAfsServiceId(Integer afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public Integer getAfsServiceId() {
        return afsServiceId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setAfsApplyTime(Date afsApplyTime) {
        this.afsApplyTime = afsApplyTime;
    }

    public Date getAfsApplyTime() {
        return afsApplyTime;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setProcessedDate(Date processedDate) {
        this.processedDate = processedDate;
    }

    public Date getProcessedDate() {
        return processedDate;
    }

    private Integer afsServiceId;
    private Long orderId;
    private String customerName;
    private Date afsApplyTime;
    private Date approvedDate;
    private Date processedDate;
}
