// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryOrderForJosResultDto.java

package com.jd.open.api.sdk.response.supplier;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class QueryOrderForJosResultDto
        implements Serializable {

    public QueryOrderForJosResultDto() {
    }

    public void setCustomOrderId(Long customOrderId) {
        this.customOrderId = customOrderId;
    }

    public Long getCustomOrderId() {
        return customOrderId;
    }

    public void setPay(BigDecimal pay) {
        this.pay = pay;
    }

    public BigDecimal getPay() {
        return pay;
    }

    public void setOperatorState(Integer operatorState) {
        this.operatorState = operatorState;
    }

    public Integer getOperatorState() {
        return operatorState;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setExpectedDeliveryTime(Date expectedDeliveryTime) {
        this.expectedDeliveryTime = expectedDeliveryTime;
    }

    public Date getExpectedDeliveryTime() {
        return expectedDeliveryTime;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderCreateDate(Date orderCreateDate) {
        this.orderCreateDate = orderCreateDate;
    }

    public Date getOrderCreateDate() {
        return orderCreateDate;
    }

    public void setIsNotice(Integer isNotice) {
        this.isNotice = isNotice;
    }

    public Integer getIsNotice() {
        return isNotice;
    }

    public void setSendPay(String sendPay) {
        this.sendPay = sendPay;
    }

    public String getSendPay() {
        return sendPay;
    }

    public void setPaymentCategory(String paymentCategory) {
        this.paymentCategory = paymentCategory;
    }

    public String getPaymentCategory() {
        return paymentCategory;
    }

    public void setPaymentCategoryDispName(String paymentCategoryDispName) {
        this.paymentCategoryDispName = paymentCategoryDispName;
    }

    public String getPaymentCategoryDispName() {
        return paymentCategoryDispName;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void setRefundSourceFlag(int refundSourceFlag) {
        this.refundSourceFlag = refundSourceFlag;
    }

    public int getRefundSourceFlag() {
        return refundSourceFlag;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getTownName() {
        return townName;
    }

    public void setOrderDetailList(List orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public List getOrderDetailList() {
        return orderDetailList;
    }

    private Long customOrderId;
    private BigDecimal pay;
    private Integer operatorState;
    private String consigneeName;
    private String postcode;
    private Date expectedDeliveryTime;
    private String telephone;
    private String phone;
    private String email;
    private String address;
    private Date orderTime;
    private String orderRemark;
    private Date orderCreateDate;
    private Integer isNotice;
    private String sendPay;
    private String paymentCategory;
    private String paymentCategoryDispName;
    private Date createDate;
    private String pin;
    private int refundSourceFlag;
    private String provinceName;
    private String cityName;
    private String countyName;
    private String townName;
    private List orderDetailList;
}
