// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultObjectOrderId.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;

public class PublicResultObjectOrderId
        implements Serializable {

    public PublicResultObjectOrderId() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    private Integer resultCode;
    private Long orderId;
}
