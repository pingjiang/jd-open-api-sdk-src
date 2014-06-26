// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IncomeExpenseVO.java

package com.jd.open.api.sdk.domain.kuaiche.AccountJosService;

import java.io.Serializable;

public class IncomeExpenseVO
        implements Serializable {

    public IncomeExpenseVO() {
    }

    public void setSwiftNumber(Long swiftNumber) {
        this.swiftNumber = swiftNumber;
    }

    public Long getSwiftNumber() {
        return swiftNumber;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getAmount() {
        return amount;
    }

    public void setInOutType(Long inOutType) {
        this.inOutType = inOutType;
    }

    public Long getInOutType() {
        return inOutType;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getShowDate() {
        return showDate;
    }

    private Long swiftNumber;
    private String creatTime;
    private Long amount;
    private Long inOutType;
    private String remark;
    private String showDate;
}
