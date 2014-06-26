// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderSoplPrintDataGetResponse.java

package com.jd.open.api.sdk.response.order;

import com.jd.open.api.sdk.domain.order.OrderSoplPrintData;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderSoplPrintDataGetResponse extends AbstractResponse {

    public OrderSoplPrintDataGetResponse() {
    }

    public OrderSoplPrintData getApiOrderPrintData() {
        return apiOrderPrintData;
    }

    public void setApiOrderPrintData(OrderSoplPrintData apiOrderPrintData) {
        this.apiOrderPrintData = apiOrderPrintData;
    }

    private static final long serialVersionUID = 0x6427abd7L;
    private OrderSoplPrintData apiOrderPrintData;
}
