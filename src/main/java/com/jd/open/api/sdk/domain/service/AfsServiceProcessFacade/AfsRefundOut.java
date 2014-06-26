// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsRefundOut.java

package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade;

import java.io.Serializable;
import java.math.BigDecimal;

public class AfsRefundOut
        implements Serializable {

    public AfsRefundOut() {
    }

    public void setAfsRefundId(Integer afsRefundId) {
        this.afsRefundId = afsRefundId;
    }

    public Integer getAfsRefundId() {
        return afsRefundId;
    }

    public void setAfsServiceId(Integer afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public Integer getAfsServiceId() {
        return afsServiceId;
    }

    public void setSuggestAmount(BigDecimal suggestAmount) {
        this.suggestAmount = suggestAmount;
    }

    public BigDecimal getSuggestAmount() {
        return suggestAmount;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setPayInfo(String payInfo) {
        this.payInfo = payInfo;
    }

    public String getPayInfo() {
        return payInfo;
    }

    private Integer afsRefundId;
    private Integer afsServiceId;
    private BigDecimal suggestAmount;
    private String mark;
    private String reason;
    private String payInfo;
}
