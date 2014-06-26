// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsReturnorderQueryResponse.java

package com.jd.open.api.sdk.response.wms;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.wms:
//            ResponseReturnOrder

public class LogisticsReturnorderQueryResponse extends AbstractResponse {

    public LogisticsReturnorderQueryResponse() {
    }

    public void setResponseReturnOrder(ResponseReturnOrder responseReturnOrder) {
        this.responseReturnOrder = responseReturnOrder;
    }

    public ResponseReturnOrder getResponseReturnOrder() {
        return responseReturnOrder;
    }

    private ResponseReturnOrder responseReturnOrder;
}
