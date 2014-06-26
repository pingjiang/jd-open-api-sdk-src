// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ShopJosResult.java

package com.jd.open.api.sdk.domain.seller.ShopSafService;

import java.io.Serializable;
import java.util.Date;

public class ShopJosResult
        implements Serializable {

    public ShopJosResult() {
    }

    public void setVenderId(Long venderId) {
        this.venderId = venderId;
    }

    public Long getVenderId() {
        return venderId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getBrief() {
        return brief;
    }

    public void setCategoryMain(Long categoryMain) {
        this.categoryMain = categoryMain;
    }

    public Long getCategoryMain() {
        return categoryMain;
    }

    public void setCategoryMainName(String categoryMainName) {
        this.categoryMainName = categoryMainName;
    }

    public String getCategoryMainName() {
        return categoryMainName;
    }

    private Long venderId;
    private Long shopId;
    private String shopName;
    private Date openTime;
    private String logoUrl;
    private String brief;
    private Long categoryMain;
    private String categoryMainName;
}
