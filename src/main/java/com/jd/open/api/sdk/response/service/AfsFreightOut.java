// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsFreightOut.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;
import java.math.BigDecimal;

public class AfsFreightOut
        implements Serializable {

    public AfsFreightOut() {
    }

    public void setAfsFreightId(Integer afsFreightId) {
        this.afsFreightId = afsFreightId;
    }

    public Integer getAfsFreightId() {
        return afsFreightId;
    }

    public void setAfsServiceId(Integer afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public Integer getAfsServiceId() {
        return afsServiceId;
    }

    public void setPartReceiveId(Integer partReceiveId) {
        this.partReceiveId = partReceiveId;
    }

    public Integer getPartReceiveId() {
        return partReceiveId;
    }

    public void setFreightCode(String freightCode) {
        this.freightCode = freightCode;
    }

    public String getFreightCode() {
        return freightCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setFreightMoney(BigDecimal freightMoney) {
        this.freightMoney = freightMoney;
    }

    public BigDecimal getFreightMoney() {
        return freightMoney;
    }

    public void setModifiedMoney(BigDecimal modifiedMoney) {
        this.modifiedMoney = modifiedMoney;
    }

    public BigDecimal getModifiedMoney() {
        return modifiedMoney;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    private Integer afsFreightId;
    private Integer afsServiceId;
    private Integer partReceiveId;
    private String freightCode;
    private String expressCode;
    private BigDecimal freightMoney;
    private BigDecimal modifiedMoney;
    private String expressCompany;
    private String remark;
}
