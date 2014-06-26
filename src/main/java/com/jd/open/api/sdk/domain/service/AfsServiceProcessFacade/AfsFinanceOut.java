// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsFinanceOut.java

package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade;

import java.io.Serializable;
import java.math.BigDecimal;

public class AfsFinanceOut
        implements Serializable {

    public AfsFinanceOut() {
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setIdFinance(Integer idFinance) {
        this.idFinance = idFinance;
    }

    public Integer getIdFinance() {
        return idFinance;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setBilv(BigDecimal bilv) {
        this.bilv = bilv;
    }

    public BigDecimal getBilv() {
        return bilv;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setMargReason(String margReason) {
        this.margReason = margReason;
    }

    public String getMargReason() {
        return margReason;
    }

    public void setRefundment(BigDecimal refundment) {
        this.refundment = refundment;
    }

    public BigDecimal getRefundment() {
        return refundment;
    }

    public void setCarriage(BigDecimal carriage) {
        this.carriage = carriage;
    }

    public BigDecimal getCarriage() {
        return carriage;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    public BigDecimal getRebate() {
        return rebate;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBank() {
        return bank;
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

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setOpPin(String opPin) {
        this.opPin = opPin;
    }

    public String getOpPin() {
        return opPin;
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpTime(String opTime) {
        this.opTime = opTime;
    }

    public String getOpTime() {
        return opTime;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    public String getCodeAccount() {
        return codeAccount;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    private String userName;
    private String userId;
    private Integer serviceId;
    private Integer idFinance;
    private Long orderId;
    private String reason;
    private BigDecimal bilv;
    private BigDecimal price;
    private String margReason;
    private BigDecimal refundment;
    private BigDecimal carriage;
    private BigDecimal rebate;
    private String type;
    private String bank;
    private Integer wareId;
    private String wareName;
    private String memberPhone;
    private String opPin;
    private String opName;
    private String opTime;
    private String account;
    private String codeAccount;
    private String notes;
}
