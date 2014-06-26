// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsO2oSkuStock_ownerUpdateResponse.java

package com.jd.open.api.sdk.response.O2O;

import com.jd.open.api.sdk.domain.O2O.StoreOFCService.SkuAddResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LogisticsO2oSkuStock_ownerUpdateResponse extends AbstractResponse {

    public LogisticsO2oSkuStock_ownerUpdateResponse() {
    }

    public void setSkuAddResponse(SkuAddResponse SkuAddResponse) {
        this.SkuAddResponse = SkuAddResponse;
    }

    public SkuAddResponse getSkuAddResponse() {
        return SkuAddResponse;
    }

    private SkuAddResponse SkuAddResponse;
}
