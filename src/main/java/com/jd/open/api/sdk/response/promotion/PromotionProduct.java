// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PromotionProduct.java

package com.jd.open.api.sdk.response.promotion;


public class PromotionProduct {

    public PromotionProduct() {
    }

    public String getMain() {
        return isMain;
    }

    public void setMain(String main) {
        isMain = main;
    }

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public long getProdId() {
        return prodId;
    }

    public void setProdId(long prodId) {
        this.prodId = prodId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(String promoPrice) {
        this.promoPrice = promoPrice;
    }

    private long skuId;
    private String prodName;
    private long prodId;
    private String price;
    private String promoPrice;
    private String isMain;
}
