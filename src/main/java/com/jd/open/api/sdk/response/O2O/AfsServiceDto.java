// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsServiceDto.java

package com.jd.open.api.sdk.response.O2O;

import java.io.Serializable;
import java.util.List;

public class AfsServiceDto
        implements Serializable {

    public AfsServiceDto() {
    }

    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerStationNo(String customerStationNo) {
        this.customerStationNo = customerStationNo;
    }

    public String getCustomerStationNo() {
        return customerStationNo;
    }

    public void setCustomerOrderApplyTime(String customerOrderApplyTime) {
        this.customerOrderApplyTime = customerOrderApplyTime;
    }

    public String getCustomerOrderApplyTime() {
        return customerOrderApplyTime;
    }

    public void setCustomerOrderVerifyTime(String customerOrderVerifyTime) {
        this.customerOrderVerifyTime = customerOrderVerifyTime;
    }

    public String getCustomerOrderVerifyTime() {
        return customerOrderVerifyTime;
    }

    public void setCustomerOrderFinishTime(String customerOrderFinishTime) {
        this.customerOrderFinishTime = customerOrderFinishTime;
    }

    public String getCustomerOrderFinishTime() {
        return customerOrderFinishTime;
    }

    public void setCustomerOrderState(String customerOrderState) {
        this.customerOrderState = customerOrderState;
    }

    public String getCustomerOrderState() {
        return customerOrderState;
    }

    public void setCustomerOrderType(String customerOrderType) {
        this.customerOrderType = customerOrderType;
    }

    public String getCustomerOrderType() {
        return customerOrderType;
    }

    public void setCustomerOrderCert(String customerOrderCert) {
        this.customerOrderCert = customerOrderCert;
    }

    public String getCustomerOrderCert() {
        return customerOrderCert;
    }

    public void setCustomerOrderProblem(String customerOrderProblem) {
        this.customerOrderProblem = customerOrderProblem;
    }

    public String getCustomerOrderProblem() {
        return customerOrderProblem;
    }

    public void setCustomerOrderReturnWay(String customerOrderReturnWay) {
        this.customerOrderReturnWay = customerOrderReturnWay;
    }

    public String getCustomerOrderReturnWay() {
        return customerOrderReturnWay;
    }

    public void setCustomerOrderContactor(String customerOrderContactor) {
        this.customerOrderContactor = customerOrderContactor;
    }

    public String getCustomerOrderContactor() {
        return customerOrderContactor;
    }

    public void setCustomerOrderContactorTel(String customerOrderContactorTel) {
        this.customerOrderContactorTel = customerOrderContactorTel;
    }

    public String getCustomerOrderContactorTel() {
        return customerOrderContactorTel;
    }

    public void setCustomerOrderVerifyRemark(String customerOrderVerifyRemark) {
        this.customerOrderVerifyRemark = customerOrderVerifyRemark;
    }

    public String getCustomerOrderVerifyRemark() {
        return customerOrderVerifyRemark;
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

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return payType;
    }

    public void setCashRefund(String cashRefund) {
        this.cashRefund = cashRefund;
    }

    public String getCashRefund() {
        return cashRefund;
    }

    public void setPosRefund(String posRefund) {
        this.posRefund = posRefund;
    }

    public String getPosRefund() {
        return posRefund;
    }

    public void setPinBuyer(String pinBuyer) {
        this.pinBuyer = pinBuyer;
    }

    public String getPinBuyer() {
        return pinBuyer;
    }

    public void setCustomerOrderDetailList(List customerOrderDetailList) {
        this.customerOrderDetailList = customerOrderDetailList;
    }

    public List getCustomerOrderDetailList() {
        return customerOrderDetailList;
    }

    public void setRefundList(List refundList) {
        this.refundList = refundList;
    }

    public List getRefundList() {
        return refundList;
    }

    private String customerOrderId;
    private String customerStationNo;
    private String customerOrderApplyTime;
    private String customerOrderVerifyTime;
    private String customerOrderFinishTime;
    private String customerOrderState;
    private String customerOrderType;
    private String customerOrderCert;
    private String customerOrderProblem;
    private String customerOrderReturnWay;
    private String customerOrderContactor;
    private String customerOrderContactorTel;
    private String customerOrderVerifyRemark;
    private String orderId;
    private String venderId;
    private String payType;
    private String cashRefund;
    private String posRefund;
    private String pinBuyer;
    private List customerOrderDetailList;
    private List refundList;
}
