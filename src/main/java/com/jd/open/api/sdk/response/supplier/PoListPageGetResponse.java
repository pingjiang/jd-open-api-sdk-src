// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PoListPageGetResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosAPI.OrderResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PoListPageGetResponse extends AbstractResponse {

    public PoListPageGetResponse() {
    }

    public void setOrderResultDto(OrderResultDto orderResultDto) {
        this.orderResultDto = orderResultDto;
    }

    public OrderResultDto getOrderResultDto() {
        return orderResultDto;
    }

    private OrderResultDto orderResultDto;
}
