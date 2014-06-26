// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PromoteWareDetail.java

package com.jd.open.api.sdk.domain.website.cps;

import com.jd.open.api.sdk.domain.website.ware.Ware;

public class PromoteWareDetail {

    public PromoteWareDetail() {
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public String getClickUrl() {
        return clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;
    }

    public String getShopClickUrl() {
        return shopClickUrl;
    }

    public void setShopClickUrl(String shopClickUrl) {
        this.shopClickUrl = shopClickUrl;
    }

    private Ware ware;
    private String clickUrl;
    private String shopClickUrl;
}
