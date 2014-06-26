// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderGetResponse.java

package com.jd.open.api.sdk.response.order;

import com.jd.open.api.sdk.domain.order.OrderDetailInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderGetResponse extends AbstractResponse {

    public OrderGetResponse() {
    }

    public OrderDetailInfo getOrderDetailInfo() {
        return orderDetailInfo;
    }

    public void setOrderDetailInfo(OrderDetailInfo orderDetailInfo) {
        this.orderDetailInfo = orderDetailInfo;
    }

    private OrderDetailInfo orderDetailInfo;
}
