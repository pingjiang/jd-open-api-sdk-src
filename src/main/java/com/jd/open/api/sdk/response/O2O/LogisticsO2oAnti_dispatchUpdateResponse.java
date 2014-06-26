// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsO2oAnti_dispatchUpdateResponse.java

package com.jd.open.api.sdk.response.O2O;

import com.jd.open.api.sdk.domain.O2O.StoreOFCService.OrderServiceResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LogisticsO2oAnti_dispatchUpdateResponse extends AbstractResponse {

    public LogisticsO2oAnti_dispatchUpdateResponse() {
    }

    public void setOrderServiceResponse(OrderServiceResponse OrderServiceResponse) {
        this.OrderServiceResponse = OrderServiceResponse;
    }

    public OrderServiceResponse getOrderServiceResponse() {
        return OrderServiceResponse;
    }

    private OrderServiceResponse OrderServiceResponse;
}
