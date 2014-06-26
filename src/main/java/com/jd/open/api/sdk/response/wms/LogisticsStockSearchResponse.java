// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsStockSearchResponse.java

package com.jd.open.api.sdk.response.wms;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.wms:
//            ResponseStock

public class LogisticsStockSearchResponse extends AbstractResponse {

    public LogisticsStockSearchResponse() {
    }

    public void setStock(ResponseStock stock) {
        this.stock = stock;
    }

    public ResponseStock getStock() {
        return stock;
    }

    private ResponseStock stock;
}
