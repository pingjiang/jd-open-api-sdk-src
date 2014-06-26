// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SkuColor.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;

public class SkuColor
        implements Serializable {

    public SkuColor() {
    }

    public void setColorImg(String colorImg) {
        this.colorImg = colorImg;
    }

    public String getColorImg() {
        return colorImg;
    }

    public void setWaretitle(String waretitle) {
        this.waretitle = waretitle;
    }

    public String getWaretitle() {
        return waretitle;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getWname() {
        return wname;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
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

    private String colorImg;
    private String waretitle;
    private String wname;
    private String color;
    private Boolean secKill;
    private String description;
    private Boolean promotion;
    private Boolean directShow;
    private Boolean canFreeRead;
    private Boolean showMartPrice;
    private Integer skuId;
    private String size;
}
