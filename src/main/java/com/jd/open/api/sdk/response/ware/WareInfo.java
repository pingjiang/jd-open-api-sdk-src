// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareInfo.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;

public class WareInfo
        implements Serializable {

    public WareInfo() {
    }

    public void setAdWord(String adWord) {
        this.adWord = adWord;
    }

    public String getAdWord() {
        return adWord;
    }

    public void setIsBook(Boolean isBook) {
        this.isBook = isBook;
    }

    public Boolean getIsBook() {
        return isBook;
    }

    public void setCanFreeRead(Boolean canFreeRead) {
        this.canFreeRead = canFreeRead;
    }

    public Boolean getCanFreeRead() {
        return canFreeRead;
    }

    public void setEndRemainTime(String endRemainTime) {
        this.endRemainTime = endRemainTime;
    }

    public String getEndRemainTime() {
        return endRemainTime;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setJdPrice(Double jdPrice) {
        this.jdPrice = jdPrice;
    }

    public Double getJdPrice() {
        return jdPrice;
    }

    public void setMartPrice(Double martPrice) {
        this.martPrice = martPrice;
    }

    public Double getMartPrice() {
        return martPrice;
    }

    public void setStartRemainTime(String startRemainTime) {
        this.startRemainTime = startRemainTime;
    }

    public String getStartRemainTime() {
        return startRemainTime;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public String getWareName() {
        return wareName;
    }

    private String adWord;
    private Boolean isBook;
    private Boolean canFreeRead;
    private String endRemainTime;
    private String imageUrl;
    private Double jdPrice;
    private Double martPrice;
    private String startRemainTime;
    private String skuId;
    private String wareName;
}
