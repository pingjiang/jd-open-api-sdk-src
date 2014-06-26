// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsApplyWaitAudit.java

package com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade;

import java.io.Serializable;
import java.util.Date;

public class AfsApplyWaitAudit
        implements Serializable {

    public AfsApplyWaitAudit() {
    }

    public void setAfsApplyId(Integer afsApplyId) {
        this.afsApplyId = afsApplyId;
    }

    public Integer getAfsApplyId() {
        return afsApplyId;
    }

    public void setCustomerPin(String customerPin) {
        this.customerPin = customerPin;
    }

    public String getCustomerPin() {
        return customerPin;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerMobilePhone(String customerMobilePhone) {
        this.customerMobilePhone = customerMobilePhone;
    }

    public String getCustomerMobilePhone() {
        return customerMobilePhone;
    }

    public void setPickwareAddress(String pickwareAddress) {
        this.pickwareAddress = pickwareAddress;
    }

    public String getPickwareAddress() {
        return pickwareAddress;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setAfsApplyTime(Date afsApplyTime) {
        this.afsApplyTime = afsApplyTime;
    }

    public Date getAfsApplyTime() {
        return afsApplyTime;
    }

    private Integer afsApplyId;
    private String customerPin;
    private String customerName;
    private String customerMobilePhone;
    private String pickwareAddress;
    private Long orderId;
    private Date afsApplyTime;
}
