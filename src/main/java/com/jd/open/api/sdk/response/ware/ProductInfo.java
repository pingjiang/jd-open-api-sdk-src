// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProductInfo.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;

public class ProductInfo
        implements Serializable {

    public ProductInfo() {
    }

    public void setImgUrlN5(String imgUrlN5) {
        this.imgUrlN5 = imgUrlN5;
    }

    public String getImgUrlN5() {
        return imgUrlN5;
    }

    public void setSecKill(Boolean secKill) {
        this.secKill = secKill;
    }

    public Boolean getSecKill() {
        return secKill;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getWname() {
        return wname;
    }

    public void setAdword(String adword) {
        this.adword = adword;
    }

    public String getAdword() {
        return adword;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setAverageScore(Integer averageScore) {
        this.averageScore = averageScore;
    }

    public Integer getAverageScore() {
        return averageScore;
    }

    public void setPromotion(Boolean promotion) {
        this.promotion = promotion;
    }

    public Boolean getPromotion() {
        return promotion;
    }

    public void setJdPrice(Double jdPrice) {
        this.jdPrice = jdPrice;
    }

    public Double getJdPrice() {
        return jdPrice;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getGood() {
        return good;
    }

    public void setCanConsultFlag(Boolean canConsultFlag) {
        this.canConsultFlag = canConsultFlag;
    }

    public Boolean getCanConsultFlag() {
        return canConsultFlag;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setIsbook(Boolean isbook) {
        this.isbook = isbook;
    }

    public Boolean getIsbook() {
        return isbook;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
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

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setImgUrlN1(String imgUrlN1) {
        this.imgUrlN1 = imgUrlN1;
    }

    public String getImgUrlN1() {
        return imgUrlN1;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getImgurl() {
        return imgurl;
    }

    private String imgUrlN5;
    private Boolean secKill;
    private String wname;
    private String adword;
    private Double marketPrice;
    private Integer averageScore;
    private Boolean promotion;
    private Double jdPrice;
    private String good;
    private Boolean canConsultFlag;
    private String size;
    private Boolean isbook;
    private Long totalCount;
    private String color;
    private String description;
    private Boolean directShow;
    private Boolean canFreeRead;
    private Boolean showMartPrice;
    private Long skuId;
    private String imgUrlN1;
    private String imgurl;
}
