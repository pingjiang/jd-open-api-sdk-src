// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderinfoResponse.java

package com.jd.open.api.sdk.response.O2O;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderinfoResponse
        implements Serializable {

    public OrderinfoResponse() {
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

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setSortingType(Integer sortingType) {
        this.sortingType = sortingType;
    }

    public Integer getSortingType() {
        return sortingType;
    }

    public void setOrderStockOwner(String orderStockOwner) {
        this.orderStockOwner = orderStockOwner;
    }

    public String getOrderStockOwner() {
        return orderStockOwner;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public Double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderPayment(Double orderPayment) {
        this.orderPayment = orderPayment;
    }

    public Double getOrderPayment() {
        return orderPayment;
    }

    public void setOrderSellerPrice(Double orderSellerPrice) {
        this.orderSellerPrice = orderSellerPrice;
    }

    public Double getOrderSellerPrice() {
        return orderSellerPrice;
    }

    public void setFreightPrice(Double freightPrice) {
        this.freightPrice = freightPrice;
    }

    public Double getFreightPrice() {
        return freightPrice;
    }

    public void setSellerDiscount(Double sellerDiscount) {
        this.sellerDiscount = sellerDiscount;
    }

    public Double getSellerDiscount() {
        return sellerDiscount;
    }

    public void setPinBuyer(String pinBuyer) {
        this.pinBuyer = pinBuyer;
    }

    public String getPinBuyer() {
        return pinBuyer;
    }

    public void setDeliveryType(Byte deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Byte getDeliveryType() {
        return deliveryType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setInvoiceState(String invoiceState) {
        this.invoiceState = invoiceState;
    }

    public String getInvoiceState() {
        return invoiceState;
    }

    public void setInvoiceInfo(String invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }

    public String getInvoiceInfo() {
        return invoiceInfo;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderStartTime(Date orderStartTime) {
        this.orderStartTime = orderStartTime;
    }

    public Date getOrderStartTime() {
        return orderStartTime;
    }

    public void setOrderEndTime(Date orderEndTime) {
        this.orderEndTime = orderEndTime;
    }

    public Date getOrderEndTime() {
        return orderEndTime;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getProvince() {
        return province;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getCity() {
        return city;
    }

    public void setCounty(Integer county) {
        this.county = county;
    }

    public Integer getCounty() {
        return county;
    }

    public void setTown(Integer town) {
        this.town = town;
    }

    public Integer getTown() {
        return town;
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

    public void setItemInfoList(List itemInfoList) {
        this.itemInfoList = itemInfoList;
    }

    public List getItemInfoList() {
        return itemInfoList;
    }

    public void setCouponDetailList(List couponDetailList) {
        this.couponDetailList = couponDetailList;
    }

    public List getCouponDetailList() {
        return couponDetailList;
    }

    public void setOrderStateList(List orderStateList) {
        this.orderStateList = orderStateList;
    }

    public List getOrderStateList() {
        return orderStateList;
    }

    public void setReturnOrder(String returnOrder) {
        this.returnOrder = returnOrder;
    }

    public String getReturnOrder() {
        return returnOrder;
    }

    public void setVenderRemark(String venderRemark) {
        this.venderRemark = venderRemark;
    }

    public String getVenderRemark() {
        return venderRemark;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getModified() {
        return modified;
    }

    public void setStationOrderState(Byte stationOrderState) {
        this.stationOrderState = stationOrderState;
    }

    public Byte getStationOrderState() {
        return stationOrderState;
    }

    public void setStationOrderUpdateTime(Date stationOrderUpdateTime) {
        this.stationOrderUpdateTime = stationOrderUpdateTime;
    }

    public Date getStationOrderUpdateTime() {
        return stationOrderUpdateTime;
    }

    public void setStationNo(String stationNo) {
        this.stationNo = stationNo;
    }

    public String getStationNo() {
        return stationNo;
    }

    public void setStationNoIsv(String stationNoIsv) {
        this.stationNoIsv = stationNoIsv;
    }

    public String getStationNoIsv() {
        return stationNoIsv;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationOrderType(Byte stationOrderType) {
        this.stationOrderType = stationOrderType;
    }

    public Byte getStationOrderType() {
        return stationOrderType;
    }

    public void setOrderCancelTime(Date orderCancelTime) {
        this.orderCancelTime = orderCancelTime;
    }

    public Date getOrderCancelTime() {
        return orderCancelTime;
    }

    public void setOrderCancelReason(Byte orderCancelReason) {
        this.orderCancelReason = orderCancelReason;
    }

    public Byte getOrderCancelReason() {
        return orderCancelReason;
    }

    public void setOrderBackwardRemark(String orderBackwardRemark) {
        this.orderBackwardRemark = orderBackwardRemark;
    }

    public String getOrderBackwardRemark() {
        return orderBackwardRemark;
    }

    public void setStationPaymentType(Byte stationPaymentType) {
        this.stationPaymentType = stationPaymentType;
    }

    public Byte getStationPaymentType() {
        return stationPaymentType;
    }

    public void setStationPaymentCash(Double stationPaymentCash) {
        this.stationPaymentCash = stationPaymentCash;
    }

    public Double getStationPaymentCash() {
        return stationPaymentCash;
    }

    public void setStationPaymentPos(Double stationPaymentPos) {
        this.stationPaymentPos = stationPaymentPos;
    }

    public Double getStationPaymentPos() {
        return stationPaymentPos;
    }

    public void setStationDeliveryType(Byte stationDeliveryType) {
        this.stationDeliveryType = stationDeliveryType;
    }

    public Byte getStationDeliveryType() {
        return stationDeliveryType;
    }

    public void setCarrierNo(String carrierNo) {
        this.carrierNo = carrierNo;
    }

    public String getCarrierNo() {
        return carrierNo;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setDeliverNo(String deliverNo) {
        this.deliverNo = deliverNo;
    }

    public String getDeliverNo() {
        return deliverNo;
    }

    private String orderId;
    private String venderId;
    private Byte payType;
    private Integer sortingType;
    private String orderStockOwner;
    private Double orderTotalPrice;
    private Double orderPayment;
    private Double orderSellerPrice;
    private Double freightPrice;
    private Double sellerDiscount;
    private String pinBuyer;
    private Byte deliveryType;
    private Byte orderType;
    private String invoiceState;
    private String invoiceInfo;
    private String orderRemark;
    private Date orderStartTime;
    private Date orderEndTime;
    private String fullName;
    private String fullAddress;
    private String telephone;
    private String mobile;
    private Integer province;
    private Integer city;
    private Integer county;
    private Integer town;
    private String provinceName;
    private String cityName;
    private String countyName;
    private String townName;
    private List itemInfoList;
    private List couponDetailList;
    private List orderStateList;
    private String returnOrder;
    private String venderRemark;
    private Date modified;
    private Byte stationOrderState;
    private Date stationOrderUpdateTime;
    private String stationNo;
    private String stationNoIsv;
    private String stationName;
    private Byte stationOrderType;
    private Date orderCancelTime;
    private Byte orderCancelReason;
    private String orderBackwardRemark;
    private Byte stationPaymentType;
    private Double stationPaymentCash;
    private Double stationPaymentPos;
    private Byte stationDeliveryType;
    private String carrierNo;
    private String carrierName;
    private String deliverNo;
}
