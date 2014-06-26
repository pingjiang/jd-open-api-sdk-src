// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderPrintDataGetResponse.java

package com.jd.open.api.sdk.response.order;

import com.jd.open.api.sdk.domain.order.OrderPrintData;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderPrintDataGetResponse extends AbstractResponse {

    public OrderPrintDataGetResponse() {
    }

    public OrderPrintData getApiOrderPrintData() {
        return apiOrderPrintData;
    }

    public void setApiOrderPrintData(OrderPrintData apiOrderPrintData) {
        this.apiOrderPrintData = apiOrderPrintData;
    }

    private OrderPrintData apiOrderPrintData;
}
