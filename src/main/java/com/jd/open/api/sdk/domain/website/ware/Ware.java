// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Ware.java

package com.jd.open.api.sdk.domain.website.ware;

import java.util.List;

public class Ware {

    public Ware() {
    }

    public Long getWareId() {
        return wareId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJdPrice() {
        return jdPrice;
    }

    public void setJdPrice(String jdPrice) {
        this.jdPrice = jdPrice;
    }

    public List getWareImgs() {
        return wareImgs;
    }

    public void setWareImgs(List wareImgs) {
        this.wareImgs = wareImgs;
    }

    public List getSkus() {
        return skus;
    }

    public void setSkus(List skus) {
        this.skus = skus;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    private Long wareId;
    private String title;
    private String jdPrice;
    private String mUrl;
    private List wareImgs;
    private List skus;
}
