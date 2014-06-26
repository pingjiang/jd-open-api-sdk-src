// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsServiceDetailDto.java

package com.jd.open.api.sdk.response.O2O;

import java.io.Serializable;

public class AfsServiceDetailDto
        implements Serializable {

    public AfsServiceDetailDto() {
    }

    public void setCustomerOrderSkuIdPop(String customerOrderSkuIdPop) {
        this.customerOrderSkuIdPop = customerOrderSkuIdPop;
    }

    public String getCustomerOrderSkuIdPop() {
        return customerOrderSkuIdPop;
    }

    public void setCustomerOrderSkuIdOuter(String customerOrderSkuIdOuter) {
        this.customerOrderSkuIdOuter = customerOrderSkuIdOuter;
    }

    public String getCustomerOrderSkuIdOuter() {
        return customerOrderSkuIdOuter;
    }

    public void setCustomerOrderSkuName(String customerOrderSkuName) {
        this.customerOrderSkuName = customerOrderSkuName;
    }

    public String getCustomerOrderSkuName() {
        return customerOrderSkuName;
    }

    public void setCustomerOrderApplyNum(Integer customerOrderApplyNum) {
        this.customerOrderApplyNum = customerOrderApplyNum;
    }

    public Integer getCustomerOrderApplyNum() {
        return customerOrderApplyNum;
    }

    public void setCustomerOrderVerifyNum(Integer customerOrderVerifyNum) {
        this.customerOrderVerifyNum = customerOrderVerifyNum;
    }

    public Integer getCustomerOrderVerifyNum() {
        return customerOrderVerifyNum;
    }

    public void setCustomerOrderFinishRemark(String customerOrderFinishRemark) {
        this.customerOrderFinishRemark = customerOrderFinishRemark;
    }

    public String getCustomerOrderFinishRemark() {
        return customerOrderFinishRemark;
    }

    private String customerOrderSkuIdPop;
    private String customerOrderSkuIdOuter;
    private String customerOrderSkuName;
    private Integer customerOrderApplyNum;
    private Integer customerOrderVerifyNum;
    private String customerOrderFinishRemark;
}
