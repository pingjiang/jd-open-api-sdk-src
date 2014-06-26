// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsServiceOut.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;
import java.util.Date;

public class AfsServiceOut
        implements Serializable {

    public AfsServiceOut() {
    }

    public void setAfsServiceId(Integer afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public Integer getAfsServiceId() {
        return afsServiceId;
    }

    public void setAfsCategoryId(Integer afsCategoryId) {
        this.afsCategoryId = afsCategoryId;
    }

    public Integer getAfsCategoryId() {
        return afsCategoryId;
    }

    public void setAfsApplyId(Integer afsApplyId) {
        this.afsApplyId = afsApplyId;
    }

    public Integer getAfsApplyId() {
        return afsApplyId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public String getOrderRemark() {
        return orderRemark;
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

    public void setPickwareProvince(Integer pickwareProvince) {
        this.pickwareProvince = pickwareProvince;
    }

    public Integer getPickwareProvince() {
        return pickwareProvince;
    }

    public void setPickwareCity(Integer pickwareCity) {
        this.pickwareCity = pickwareCity;
    }

    public Integer getPickwareCity() {
        return pickwareCity;
    }

    public void setPickwareCounty(Integer pickwareCounty) {
        this.pickwareCounty = pickwareCounty;
    }

    public Integer getPickwareCounty() {
        return pickwareCounty;
    }

    public void setPickwareVillage(Integer pickwareVillage) {
        this.pickwareVillage = pickwareVillage;
    }

    public Integer getPickwareVillage() {
        return pickwareVillage;
    }

    public void setPickwareAddress(String pickwareAddress) {
        this.pickwareAddress = pickwareAddress;
    }

    public String getPickwareAddress() {
        return pickwareAddress;
    }

    public void setReturnwareProvince(Integer returnwareProvince) {
        this.returnwareProvince = returnwareProvince;
    }

    public Integer getReturnwareProvince() {
        return returnwareProvince;
    }

    public void setReturnwareCity(Integer returnwareCity) {
        this.returnwareCity = returnwareCity;
    }

    public Integer getReturnwareCity() {
        return returnwareCity;
    }

    public void setReturnwareCounty(Integer returnwareCounty) {
        this.returnwareCounty = returnwareCounty;
    }

    public Integer getReturnwareCounty() {
        return returnwareCounty;
    }

    public void setReturnwareVillage(Integer returnwareVillage) {
        this.returnwareVillage = returnwareVillage;
    }

    public Integer getReturnwareVillage() {
        return returnwareVillage;
    }

    public void setReturnwareAddress(String returnwareAddress) {
        this.returnwareAddress = returnwareAddress;
    }

    public String getReturnwareAddress() {
        return returnwareAddress;
    }

    public void setCustomerExpect(Integer customerExpect) {
        this.customerExpect = customerExpect;
    }

    public Integer getCustomerExpect() {
        return customerExpect;
    }

    public void setQuestionDesc(String questionDesc) {
        this.questionDesc = questionDesc;
    }

    public String getQuestionDesc() {
        return questionDesc;
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

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return customerEmail;
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

    public void setProcessedDate(Date processedDate) {
        this.processedDate = processedDate;
    }

    public Date getProcessedDate() {
        return processedDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    private Integer afsServiceId;
    private Integer afsCategoryId;
    private Integer afsApplyId;
    private Long orderId;
    private String orderRemark;
    private Integer wareId;
    private String wareName;
    private Integer pickwareProvince;
    private Integer pickwareCity;
    private Integer pickwareCounty;
    private Integer pickwareVillage;
    private String pickwareAddress;
    private Integer returnwareProvince;
    private Integer returnwareCity;
    private Integer returnwareCounty;
    private Integer returnwareVillage;
    private String returnwareAddress;
    private Integer customerExpect;
    private String questionDesc;
    private String customerName;
    private String customerMobilePhone;
    private String customerEmail;
    private String approveName;
    private Date afsApplyTime;
    private Date approvedDate;
    private Date processedDate;
    private Date receiveDate;
    private String createName;
    private Date createDate;
}
