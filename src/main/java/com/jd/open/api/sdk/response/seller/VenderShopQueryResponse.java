// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VenderShopQueryResponse.java

package com.jd.open.api.sdk.response.seller;

import com.jd.open.api.sdk.domain.seller.ShopSafService.ShopJosResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderShopQueryResponse extends AbstractResponse {

    public VenderShopQueryResponse() {
    }

    public void setShopJosResult(ShopJosResult shopJosResult) {
        this.shopJosResult = shopJosResult;
    }

    public ShopJosResult getShopJosResult() {
        return shopJosResult;
    }

    private ShopJosResult shopJosResult;
}
