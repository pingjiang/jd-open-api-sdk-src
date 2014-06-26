// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderSopPrintDataGetResponse.java

package com.jd.open.api.sdk.response.order;

import com.jd.open.api.sdk.domain.order.OrderSopPrintData;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderSopPrintDataGetResponse extends AbstractResponse {

    public OrderSopPrintDataGetResponse() {
    }

    public OrderSopPrintData getApiOrderPrintData() {
        return apiOrderPrintData;
    }

    public void setApiOrderPrintData(OrderSopPrintData apiOrderPrintData) {
        this.apiOrderPrintData = apiOrderPrintData;
    }

    private static final long serialVersionUID = 0x1da87fd4L;
    private OrderSopPrintData apiOrderPrintData;
}
