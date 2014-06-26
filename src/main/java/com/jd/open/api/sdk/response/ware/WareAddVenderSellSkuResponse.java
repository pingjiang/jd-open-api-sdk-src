// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareAddVenderSellSkuResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.request.ware.WareAddVenderSellSkuRequest;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareAddVenderSellSkuResponse extends AbstractResponse {

    public WareAddVenderSellSkuResponse() {
    }

    public WareAddVenderSellSkuResponse(WareAddVenderSellSkuRequest wareAddVenderSellSkuRequest) {
        this.wareAddVenderSellSkuRequest = wareAddVenderSellSkuRequest;
    }

    public WareAddVenderSellSkuRequest getWareAddVenderSellSkuRequest() {
        return wareAddVenderSellSkuRequest;
    }

    public void setWareAddVenderSellSkuRequest(WareAddVenderSellSkuRequest wareAddVenderSellSkuRequest) {
        this.wareAddVenderSellSkuRequest = wareAddVenderSellSkuRequest;
    }

    public WareAddVenderSellSkuRequest wareAddVenderSellSkuRequest;
}
