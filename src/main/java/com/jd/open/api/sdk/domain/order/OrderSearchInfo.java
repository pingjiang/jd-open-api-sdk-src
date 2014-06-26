// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderSearchInfo.java

package com.jd.open.api.sdk.domain.order;

import java.util.List;

// Referenced classes of package com.jd.open.api.sdk.domain.order:
//            UserInfo, VatInvoiceInfo

public class OrderSearchInfo {

    public OrderSearchInfo() {
    }

    public String getParentOrderId() {
        return parentOrderId;
    }

    public void setParentOrderId(String parentOrderId) {
        this.parentOrderId = parentOrderId;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public VatInvoiceInfo getVatInvoiceInfo() {
        return vatInvoiceInfo;
    }

    public void setVatInvoiceInfo(VatInvoiceInfo vatInvoiceInfo) {
        this.vatInvoiceInfo = vatInvoiceInfo;
    }

    public String getPaymentConfirmTime() {
        return paymentConfirmTime;
    }

    public void setPaymentConfirmTime(String paymentConfirmTime) {
        this.paymentConfirmTime = paymentConfirmTime;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getReturnOrder() {
        return returnOrder;
    }

    public void setReturnOrder(String returnOrder) {
        this.returnOrder = returnOrder;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(String orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public String getOrderSellerPrice() {
        return orderSellerPrice;
    }

    public void setOrderSellerPrice(String orderSellerPrice) {
        this.orderSellerPrice = orderSellerPrice;
    }

    public String getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(String orderPayment) {
        this.orderPayment = orderPayment;
    }

    public String getFreightPrice() {
        return freightPrice;
    }

    public void setFreightPrice(String freightPrice) {
        this.freightPrice = freightPrice;
    }

    public String getSellerDiscount() {
        return sellerDiscount;
    }

    public void setSellerDiscount(String sellerDiscount) {
        this.sellerDiscount = sellerDiscount;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getOrderStateRemark() {
        return orderStateRemark;
    }

    public void setOrderStateRemark(String orderStateRemark) {
        this.orderStateRemark = orderStateRemark;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getInvoiceInfo() {
        return invoiceInfo;
    }

    public void setInvoiceInfo(String invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public String getOrderStartTime() {
        return orderStartTime;
    }

    public void setOrderStartTime(String orderStartTime) {
        this.orderStartTime = orderStartTime;
    }

    public String getOrderEndTime() {
        return orderEndTime;
    }

    public void setOrderEndTime(String orderEndTime) {
        this.orderEndTime = orderEndTime;
    }

    public UserInfo getConsigneeInfo() {
        return consigneeInfo;
    }

    public void setConsigneeInfo(UserInfo consigneeInfo) {
        this.consigneeInfo = consigneeInfo;
    }

    public List getItemInfoList() {
        return itemInfoList;
    }

    public void setItemInfoList(List itemInfoList) {
        this.itemInfoList = itemInfoList;
    }

    public String getVenderRemark() {
        return venderRemark;
    }

    public void setVenderRemark(String venderRemark) {
        this.venderRemark = venderRemark;
    }

    public String getBalanceUsed() {
        return balanceUsed;
    }

    public void setBalanceUsed(String balanceUsed) {
        this.balanceUsed = balanceUsed;
    }

    public List getCouponDetailList() {
        return couponDetailList;
    }

    public void setCouponDetailList(List couponDetailList) {
        this.couponDetailList = couponDetailList;
    }

    private String orderId;
    private String venderId;
    private String payType;
    private String orderTotalPrice;
    private String orderSellerPrice;
    private String orderPayment;
    private String freightPrice;
    private String sellerDiscount;
    private String orderState;
    private String orderStateRemark;
    private String deliveryType;
    private String invoiceInfo;
    private String orderRemark;
    private String orderStartTime;
    private String orderEndTime;
    private String modified;
    private UserInfo consigneeInfo;
    private List itemInfoList;
    private List couponDetailList;
    private String venderRemark;
    private String balanceUsed;
    private String paymentConfirmTime;
    private String waybill;
    private String logisticsId;
    private VatInvoiceInfo vatInvoiceInfo;
    private String parentOrderId;
    private String pin;
    private String returnOrder;
}
