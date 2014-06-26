// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsOrderSearchResponse.java

package com.jd.open.api.sdk.response.wms;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.wms:
//            HashMap

public class LogisticsOrderSearchResponse extends AbstractResponse {

    public LogisticsOrderSearchResponse() {
    }

    public void setOrders(HashMap orders) {
        this.orders = orders;
    }

    public HashMap getOrders() {
        return orders;
    }

    private HashMap orders;
}
