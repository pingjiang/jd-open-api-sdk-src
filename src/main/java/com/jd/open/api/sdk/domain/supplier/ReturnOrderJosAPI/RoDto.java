// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RoDto.java

package com.jd.open.api.sdk.domain.supplier.ReturnOrderJosAPI;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RoDto
        implements Serializable {

    public RoDto() {
    }

    public void setReturnId(Long returnId) {
        this.returnId = returnId;
    }

    public Long getReturnId() {
        return returnId;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setFromDeliverCenterName(String fromDeliverCenterName) {
        this.fromDeliverCenterName = fromDeliverCenterName;
    }

    public String getFromDeliverCenterName() {
        return fromDeliverCenterName;
    }

    public void setToDeliverCenterName(String toDeliverCenterName) {
        this.toDeliverCenterName = toDeliverCenterName;
    }

    public String getToDeliverCenterName() {
        return toDeliverCenterName;
    }

    public void setReturnStateName(String returnStateName) {
        this.returnStateName = returnStateName;
    }

    public String getReturnStateName() {
        return returnStateName;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockName() {
        return stockName;
    }

    public void setWareHouseAddress(String wareHouseAddress) {
        this.wareHouseAddress = wareHouseAddress;
    }

    public String getWareHouseAddress() {
        return wareHouseAddress;
    }

    public void setWareHouseCell(String wareHouseCell) {
        this.wareHouseCell = wareHouseCell;
    }

    public String getWareHouseCell() {
        return wareHouseCell;
    }

    public void setWareHouseContact(String wareHouseContact) {
        this.wareHouseContact = wareHouseContact;
    }

    public String getWareHouseContact() {
        return wareHouseContact;
    }

    public void setOutStoreRoomDate(Date outStoreRoomDate) {
        this.outStoreRoomDate = outStoreRoomDate;
    }

    public Date getOutStoreRoomDate() {
        return outStoreRoomDate;
    }

    public void setWareVariety(Integer wareVariety) {
        this.wareVariety = wareVariety;
    }

    public Integer getWareVariety() {
        return wareVariety;
    }

    public void setBalanceStateName(String balanceStateName) {
        this.balanceStateName = balanceStateName;
    }

    public String getBalanceStateName() {
        return balanceStateName;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    private Long returnId;
    private String providerCode;
    private String providerName;
    private Date createDate;
    private String fromDeliverCenterName;
    private String toDeliverCenterName;
    private String returnStateName;
    private Integer totalNum;
    private BigDecimal totalPrice;
    private String stockName;
    private String wareHouseAddress;
    private String wareHouseCell;
    private String wareHouseContact;
    private Date outStoreRoomDate;
    private Integer wareVariety;
    private String balanceStateName;
    private Date balanceDate;
}
