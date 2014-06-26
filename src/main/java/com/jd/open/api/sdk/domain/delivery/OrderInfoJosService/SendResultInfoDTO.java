// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SendResultInfoDTO.java

package com.jd.open.api.sdk.domain.delivery.OrderInfoJosService;

import java.io.Serializable;

public class SendResultInfoDTO
        implements Serializable {

    public SendResultInfoDTO() {
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    private String code;
    private String message;
    private String orderId;
    private String deliveryId;
}
