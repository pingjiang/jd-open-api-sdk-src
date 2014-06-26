// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderCreateResponse.java

package com.jd.open.api.sdk.domain.website.response;

import com.jd.open.api.sdk.domain.website.order.OrderCreateResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderCreateResponse extends AbstractResponse {

    public OrderCreateResponse() {
    }

    public OrderCreateResult getOrderCreateResult() {
        return orderCreateResult;
    }

    public void setOrderCreateResult(OrderCreateResult orderCreateResult) {
        this.orderCreateResult = orderCreateResult;
    }

    private OrderCreateResult orderCreateResult;
}
