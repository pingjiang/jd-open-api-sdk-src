// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsFinanceDetailOut.java

package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AfsFinanceDetailOut
        implements Serializable {

    public AfsFinanceDetailOut() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setWareId(Integer wareId) {
        this.wareId = wareId;
    }

    public Integer getWareId() {
        return wareId;
    }

    public void setFinanceId(Integer financeId) {
        this.financeId = financeId;
    }

    public Integer getFinanceId() {
        return financeId;
    }

    public void setRefundMoney(BigDecimal refundMoney) {
        this.refundMoney = refundMoney;
    }

    public BigDecimal getRefundMoney() {
        return refundMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setRefundNum(String refundNum) {
        this.refundNum = refundNum;
    }

    public String getRefundNum() {
        return refundNum;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    private Integer id;
    private Long orderId;
    private Integer wareId;
    private Integer financeId;
    private BigDecimal refundMoney;
    private BigDecimal payMoney;
    private String refundNum;
    private String account;
    private String bank;
    private Date createdDate;
}
