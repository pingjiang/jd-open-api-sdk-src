// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderCanBuyAreaResponse.java

package com.jd.open.api.sdk.domain.website.response;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class OrderCanBuyAreaResponse extends AbstractResponse {

    public OrderCanBuyAreaResponse() {
    }

    public List getCanBuyAddresses() {
        return canBuyAddresses;
    }

    public void setCanBuyAddresses(List canBuyAddresses) {
        this.canBuyAddresses = canBuyAddresses;
    }

    private List canBuyAddresses;
}
