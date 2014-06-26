// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CPSSpreadHomeInfoModule.java

package com.jd.open.api.sdk.domain.website.cps;


public class CPSSpreadHomeInfoModule {

    public CPSSpreadHomeInfoModule() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getCommissionFee() {
        return commissionFee;
    }

    public void setCommissionFee(String commissionFee) {
        this.commissionFee = commissionFee;
    }

    public String getClickUrl() {
        return clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;
    }

    private String title;
    private String picUrl;
    private String commissionFee;
    private String clickUrl;
}
