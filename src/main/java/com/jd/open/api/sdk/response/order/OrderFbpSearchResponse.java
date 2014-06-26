// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderFbpSearchResponse.java

package com.jd.open.api.sdk.response.order;

import com.jd.open.api.sdk.domain.order.OrderResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderFbpSearchResponse extends AbstractResponse {

    public OrderFbpSearchResponse() {
    }

    public OrderResult getOrderInfoResult() {
        return orderResult;
    }

    public void setOrderInfoResult(OrderResult orderResult) {
        this.orderResult = orderResult;
    }

    private static final long serialVersionUID = 0x50ff7bf4L;
    private OrderResult orderResult;
}
