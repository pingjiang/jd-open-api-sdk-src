// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareUpdateVenderSellSkuResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.request.ware.WareUpdateVenderSellSkuRequest;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareUpdateVenderSellSkuResponse extends AbstractResponse {

    public WareUpdateVenderSellSkuResponse() {
    }

    public WareUpdateVenderSellSkuResponse(WareUpdateVenderSellSkuRequest wareupdateVenderSellSkuRequest) {
        this.wareupdateVenderSellSkuRequest = wareupdateVenderSellSkuRequest;
    }

    public WareUpdateVenderSellSkuRequest getWareupdateVenderSellSkuRequest() {
        return wareupdateVenderSellSkuRequest;
    }

    public void setWareupdateVenderSellSkuRequest(WareUpdateVenderSellSkuRequest wareupdateVenderSellSkuRequest) {
        this.wareupdateVenderSellSkuRequest = wareupdateVenderSellSkuRequest;
    }

    public WareUpdateVenderSellSkuRequest wareupdateVenderSellSkuRequest;
}
