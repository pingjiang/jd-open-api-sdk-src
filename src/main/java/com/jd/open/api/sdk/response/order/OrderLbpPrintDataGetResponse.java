// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderLbpPrintDataGetResponse.java

package com.jd.open.api.sdk.response.order;

import com.jd.open.api.sdk.domain.order.OrderLbpPrintData;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderLbpPrintDataGetResponse extends AbstractResponse {

    public OrderLbpPrintDataGetResponse() {
    }

    public OrderLbpPrintData getApiOrderPrintData() {
        return apiOrderPrintData;
    }

    public void setApiOrderPrintData(OrderLbpPrintData apiOrderPrintData) {
        this.apiOrderPrintData = apiOrderPrintData;
    }

    private static final long serialVersionUID = 0x35f39eadL;
    private OrderLbpPrintData apiOrderPrintData;
}
