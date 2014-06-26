// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SkuSize.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;

public class SkuSize
        implements Serializable {

    public SkuSize() {
    }

    public void setSecKill(Boolean secKill) {
        this.secKill = secKill;
    }

    public Boolean getSecKill() {
        return secKill;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPromotion(Boolean promotion) {
        this.promotion = promotion;
    }

    public Boolean getPromotion() {
        return promotion;
    }

    public void setDirectShow(Boolean directShow) {
        this.directShow = directShow;
    }

    public Boolean getDirectShow() {
        return directShow;
    }

    public void setCanFreeRead(Boolean canFreeRead) {
        this.canFreeRead = canFreeRead;
    }

    public Boolean getCanFreeRead() {
        return canFreeRead;
    }

    public void setShowMartPrice(Boolean showMartPrice) {
        this.showMartPrice = showMartPrice;
    }

    public Boolean getShowMartPrice() {
        return showMartPrice;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    private Boolean secKill;
    private String description;
    private Boolean promotion;
    private Boolean directShow;
    private Boolean canFreeRead;
    private Boolean showMartPrice;
    private Integer skuId;
    private String size;
}
