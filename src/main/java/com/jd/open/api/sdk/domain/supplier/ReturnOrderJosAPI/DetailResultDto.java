// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DetailResultDto.java

package com.jd.open.api.sdk.domain.supplier.ReturnOrderJosAPI;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DetailResultDto
        implements Serializable {

    public DetailResultDto() {
    }

    public void setReturnId(Long returnId) {
        this.returnId = returnId;
    }

    public Long getReturnId() {
        return returnId;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
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

    public void setWareVariety(Integer wareVariety) {
        this.wareVariety = wareVariety;
    }

    public Integer getWareVariety() {
        return wareVariety;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setBalanceState(Integer balanceState) {
        this.balanceState = balanceState;
    }

    public Integer getBalanceState() {
        return balanceState;
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

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOutStoreRoomDate(Date outStoreRoomDate) {
        this.outStoreRoomDate = outStoreRoomDate;
    }

    public Date getOutStoreRoomDate() {
        return outStoreRoomDate;
    }

    public void setDetailDtoList(List detailDtoList) {
        this.detailDtoList = detailDtoList;
    }

    public List getDetailDtoList() {
        return detailDtoList;
    }

    private Long returnId;
    private Date createDate;
    private String providerCode;
    private String providerName;
    private String fromDeliverCenterName;
    private String toDeliverCenterName;
    private Integer totalNum;
    private BigDecimal totalPrice;
    private Integer wareVariety;
    private Date bookingDate;
    private Date deliverTime;
    private Integer balanceState;
    private String balanceStateName;
    private Date balanceDate;
    private String opinion;
    private Date outStoreRoomDate;
    private List detailDtoList;
}
