// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerCatsGetResponse.java

package com.jd.open.api.sdk.response.sellercat;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class SellerCatsGetResponse extends AbstractResponse {

    public SellerCatsGetResponse() {
    }

    public List getShopCatList() {
        return shopCatList;
    }

    public void setShopCatList(List shopCatList) {
        this.shopCatList = shopCatList;
    }

    private List shopCatList;
}
