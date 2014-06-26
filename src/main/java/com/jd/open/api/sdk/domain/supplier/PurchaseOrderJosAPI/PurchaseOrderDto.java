// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PurchaseOrderDto.java

package com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosAPI;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PurchaseOrderDto
        implements Serializable {

    public PurchaseOrderDto() {
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setDeliverCenterId(Integer deliverCenterId) {
        this.deliverCenterId = deliverCenterId;
    }

    public Integer getDeliverCenterId() {
        return deliverCenterId;
    }

    public void setDeliverCenterName(String deliverCenterName) {
        this.deliverCenterName = deliverCenterName;
    }

    public String getDeliverCenterName() {
        return deliverCenterName;
    }

    public void setTotalPrices(BigDecimal totalPrices) {
        this.totalPrices = totalPrices;
    }

    public BigDecimal getTotalPrices() {
        return totalPrices;
    }

    public void setPurchaserErpCode(String purchaserErpCode) {
        this.purchaserErpCode = purchaserErpCode;
    }

    public String getPurchaserErpCode() {
        return purchaserErpCode;
    }

    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
    }

    public String getPurchaserName() {
        return purchaserName;
    }

    public void setIsCanConfirm(Boolean isCanConfirm) {
        this.isCanConfirm = isCanConfirm;
    }

    public Boolean getIsCanConfirm() {
        return isCanConfirm;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setAccountPeriod(Integer accountPeriod) {
        this.accountPeriod = accountPeriod;
    }

    public Integer getAccountPeriod() {
        return accountPeriod;
    }

    public void setOu(String ou) {
        this.ou = ou;
    }

    public String getOu() {
        return ou;
    }

    public void setYnPaid(String ynPaid) {
        this.ynPaid = ynPaid;
    }

    public String getYnPaid() {
        return ynPaid;
    }

    public void setYnContainTax(String ynContainTax) {
        this.ynContainTax = ynContainTax;
    }

    public String getYnContainTax() {
        return ynContainTax;
    }

    public void setChargeTransit(String chargeTransit) {
        this.chargeTransit = chargeTransit;
    }

    public String getChargeTransit() {
        return chargeTransit;
    }

    public void setTransitType(String transitType) {
        this.transitType = transitType;
    }

    public String getTransitType() {
        return transitType;
    }

    public void setArrivalDays(Integer arrivalDays) {
        this.arrivalDays = arrivalDays;
    }

    public Integer getArrivalDays() {
        return arrivalDays;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }

    public Integer getCheckType() {
        return checkType;
    }

    public void setCheckTypeName(String checkTypeName) {
        this.checkTypeName = checkTypeName;
    }

    public String getCheckTypeName() {
        return checkTypeName;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setWarehousePhone(String warehousePhone) {
        this.warehousePhone = warehousePhone;
    }

    public String getWarehousePhone() {
        return warehousePhone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPurchaseType(Integer purchaseType) {
        this.purchaseType = purchaseType;
    }

    public Integer getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseTypeName(String purchaseTypeName) {
        this.purchaseTypeName = purchaseTypeName;
    }

    public String getPurchaseTypeName() {
        return purchaseTypeName;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderTypeName(String orderTypeName) {
        this.orderTypeName = orderTypeName;
    }

    public String getOrderTypeName() {
        return orderTypeName;
    }

    public void setOrderAttribute(Integer orderAttribute) {
        this.orderAttribute = orderAttribute;
    }

    public Integer getOrderAttribute() {
        return orderAttribute;
    }

    public void setOrderAttributeName(String orderAttributeName) {
        this.orderAttributeName = orderAttributeName;
    }

    public String getOrderAttributeName() {
        return orderAttributeName;
    }

    public void setOriginalTotalNum(Integer originalTotalNum) {
        this.originalTotalNum = originalTotalNum;
    }

    public Integer getOriginalTotalNum() {
        return originalTotalNum;
    }

    public void setWareVariety(Integer wareVariety) {
        this.wareVariety = wareVariety;
    }

    public Integer getWareVariety() {
        return wareVariety;
    }

    public void setCustomOrderId(Integer customOrderId) {
        this.customOrderId = customOrderId;
    }

    public Integer getCustomOrderId() {
        return customOrderId;
    }

    public void setConfirmState(Integer confirmState) {
        this.confirmState = confirmState;
    }

    public Integer getConfirmState() {
        return confirmState;
    }

    public void setConfirmStateName(String confirmStateName) {
        this.confirmStateName = confirmStateName;
    }

    public String getConfirmStateName() {
        return confirmStateName;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return state;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }

    private Long orderId;
    private Date createdDate;
    private Date completeDate;
    private String providerCode;
    private String providerName;
    private Integer deliverCenterId;
    private String deliverCenterName;
    private BigDecimal totalPrices;
    private String purchaserErpCode;
    private String purchaserName;
    private Boolean isCanConfirm;
    private Integer status;
    private String statusName;
    private Integer accountPeriod;
    private String ou;
    private String ynPaid;
    private String ynContainTax;
    private String chargeTransit;
    private String transitType;
    private Integer arrivalDays;
    private Integer checkType;
    private String checkTypeName;
    private String deliveryAddress;
    private String receiverName;
    private String warehousePhone;
    private String address;
    private Integer purchaseType;
    private String purchaseTypeName;
    private Integer orderType;
    private String orderTypeName;
    private Integer orderAttribute;
    private String orderAttributeName;
    private Integer originalTotalNum;
    private Integer wareVariety;
    private Integer customOrderId;
    private Integer confirmState;
    private String confirmStateName;
    private Integer state;
    private String stateName;
}
