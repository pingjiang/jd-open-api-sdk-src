// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsO2oOrderCarriageResponse.java

package com.jd.open.api.sdk.response.O2O;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.O2O:
//            OrderExportResponse

public class LogisticsO2oOrderCarriageResponse extends AbstractResponse {

    public LogisticsO2oOrderCarriageResponse() {
    }

    public void setOrderExport(OrderExportResponse OrderExport) {
        this.OrderExport = OrderExport;
    }

    public OrderExportResponse getOrderExport() {
        return OrderExport;
    }

    private OrderExportResponse OrderExport;
}
