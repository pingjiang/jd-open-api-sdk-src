// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsServiceMessage.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;
import java.util.Date;

public class AfsServiceMessage
        implements Serializable {

    public AfsServiceMessage() {
    }

    public void setAfsServiceId(Integer afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public Integer getAfsServiceId() {
        return afsServiceId;
    }

    public void setAfsApplyId(Integer afsApplyId) {
        this.afsApplyId = afsApplyId;
    }

    public Integer getAfsApplyId() {
        return afsApplyId;
    }

    public void setAfsCategoryId(Integer afsCategoryId) {
        this.afsCategoryId = afsCategoryId;
    }

    public Integer getAfsCategoryId() {
        return afsCategoryId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setWareId(Integer wareId) {
        this.wareId = wareId;
    }

    public Integer getWareId() {
        return wareId;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public String getWareName() {
        return wareName;
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

    public void setApproveName(String approveName) {
        this.approveName = approveName;
    }

    public String getApproveName() {
        return approveName;
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

    private Integer afsServiceId;
    private Integer afsApplyId;
    private Integer afsCategoryId;
    private Long orderId;
    private Integer wareId;
    private String wareName;
    private String customerName;
    private String customerMobilePhone;
    private String approveName;
    private Date afsApplyTime;
    private Date approvedDate;
}
