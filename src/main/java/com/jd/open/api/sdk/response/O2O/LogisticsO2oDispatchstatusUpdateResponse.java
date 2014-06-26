// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsO2oDispatchstatusUpdateResponse.java

package com.jd.open.api.sdk.response.O2O;

import com.jd.open.api.sdk.domain.O2O.StoreOFCService.ResponseStatus;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LogisticsO2oDispatchstatusUpdateResponse extends AbstractResponse {

    public LogisticsO2oDispatchstatusUpdateResponse() {
    }

    public void setOrderResponseStatus(ResponseStatus OrderResponseStatus) {
        this.OrderResponseStatus = OrderResponseStatus;
    }

    public ResponseStatus getOrderResponseStatus() {
        return OrderResponseStatus;
    }

    private ResponseStatus OrderResponseStatus;
}
