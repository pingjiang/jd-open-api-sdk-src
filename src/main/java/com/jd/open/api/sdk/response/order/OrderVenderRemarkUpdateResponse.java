// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderVenderRemarkUpdateResponse.java

package com.jd.open.api.sdk.response.order;

import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderVenderRemarkUpdateResponse extends AbstractResponse {

    public OrderVenderRemarkUpdateResponse() {
    }

    public OrderVenderRemarkUpdateResponse(String venderId, String orderId) {
        this.venderId = venderId;
        this.orderId = orderId;
    }

    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    private String venderId;
    private String modified;
    private String orderId;
}
