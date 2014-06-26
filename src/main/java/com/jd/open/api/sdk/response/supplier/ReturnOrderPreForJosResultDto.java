// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReturnOrderPreForJosResultDto.java

package com.jd.open.api.sdk.response.supplier;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ReturnOrderPreForJosResultDto
        implements Serializable {

    public ReturnOrderPreForJosResultDto() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCustomOrderId(Long customOrderId) {
        this.customOrderId = customOrderId;
    }

    public Long getCustomOrderId() {
        return customOrderId;
    }

    public void setRoApplyFee(BigDecimal roApplyFee) {
        this.roApplyFee = roApplyFee;
    }

    public BigDecimal getRoApplyFee() {
        return roApplyFee;
    }

    public void setRoApplyDate(Date roApplyDate) {
        this.roApplyDate = roApplyDate;
    }

    public Date getRoApplyDate() {
        return roApplyDate;
    }

    public void setOrderCreateDate(Date orderCreateDate) {
        this.orderCreateDate = orderCreateDate;
    }

    public Date getOrderCreateDate() {
        return orderCreateDate;
    }

    public void setApprovalState(Integer approvalState) {
        this.approvalState = approvalState;
    }

    public Integer getApprovalState() {
        return approvalState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setRoPreNo(Long roPreNo) {
        this.roPreNo = roPreNo;
    }

    public Long getRoPreNo() {
        return roPreNo;
    }

    public void setRoAccount(String roAccount) {
        this.roAccount = roAccount;
    }

    public String getRoAccount() {
        return roAccount;
    }

    public void setRoReason(String roReason) {
        this.roReason = roReason;
    }

    public String getRoReason() {
        return roReason;
    }

    public void setApprovalSuggestion(String approvalSuggestion) {
        this.approvalSuggestion = approvalSuggestion;
    }

    public String getApprovalSuggestion() {
        return approvalSuggestion;
    }

    public void setOrderDetailList(List orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public List getOrderDetailList() {
        return orderDetailList;
    }

    private Long id;
    private Long customOrderId;
    private BigDecimal roApplyFee;
    private Date roApplyDate;
    private Date orderCreateDate;
    private Integer approvalState;
    private Integer orderState;
    private Long roPreNo;
    private String roAccount;
    private String roReason;
    private String approvalSuggestion;
    private List orderDetailList;
}
