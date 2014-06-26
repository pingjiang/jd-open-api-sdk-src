// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PurchaseAllocationDetailDto.java

package com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosAPI;

import java.io.Serializable;
import java.math.BigDecimal;

// Referenced classes of package com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosAPI:
//            PurchaseWarePropertyDto

public class PurchaseAllocationDetailDto
        implements Serializable {

    public PurchaseAllocationDetailDto() {
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public Long getWareId() {
        return wareId;
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

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public String getWareName() {
        return wareName;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setTotoalPrice(BigDecimal totoalPrice) {
        this.totoalPrice = totoalPrice;
    }

    public BigDecimal getTotoalPrice() {
        return totoalPrice;
    }

    public void setMakePrice(BigDecimal makePrice) {
        this.makePrice = makePrice;
    }

    public BigDecimal getMakePrice() {
        return makePrice;
    }

    public void setCurrentMakePrice(BigDecimal currentMakePrice) {
        this.currentMakePrice = currentMakePrice;
    }

    public BigDecimal getCurrentMakePrice() {
        return currentMakePrice;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setOriginalNum(Integer originalNum) {
        this.originalNum = originalNum;
    }

    public Integer getOriginalNum() {
        return originalNum;
    }

    public void setConfirmNum(Integer confirmNum) {
        this.confirmNum = confirmNum;
    }

    public Integer getConfirmNum() {
        return confirmNum;
    }

    public void setActualNum(Integer actualNum) {
        this.actualNum = actualNum;
    }

    public Integer getActualNum() {
        return actualNum;
    }

    public void setNonDeliveryReason(String nonDeliveryReason) {
        this.nonDeliveryReason = nonDeliveryReason;
    }

    public String getNonDeliveryReason() {
        return nonDeliveryReason;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setPurchaseWareProperty(PurchaseWarePropertyDto purchaseWareProperty) {
        this.purchaseWareProperty = purchaseWareProperty;
    }

    public PurchaseWarePropertyDto getPurchaseWareProperty() {
        return purchaseWareProperty;
    }

    private Long wareId;
    private Integer deliverCenterId;
    private String deliverCenterName;
    private String wareName;
    private BigDecimal purchasePrice;
    private BigDecimal totoalPrice;
    private BigDecimal makePrice;
    private BigDecimal currentMakePrice;
    private BigDecimal discount;
    private Integer originalNum;
    private Integer confirmNum;
    private Integer actualNum;
    private String nonDeliveryReason;
    private String remark;
    private String isbn;
    private String brandName;
    private String brandId;
    private PurchaseWarePropertyDto purchaseWareProperty;
}
