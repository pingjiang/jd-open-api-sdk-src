// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsO2oOrderSearchResponse.java

package com.jd.open.api.sdk.response.O2O;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.O2O:
//            OrderResponse

public class LogisticsO2oOrderSearchResponse extends AbstractResponse {

    public LogisticsO2oOrderSearchResponse() {
    }

    public void setOrder(OrderResponse order) {
        this.order = order;
    }

    public OrderResponse getOrder() {
        return order;
    }

    private OrderResponse order;
}
