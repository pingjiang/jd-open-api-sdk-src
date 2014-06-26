// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ItemInfo.java

package com.jd.open.api.sdk.domain.order;


public class ItemInfo {

    public ItemInfo() {
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getOuterSkuId() {
        return outerSkuId;
    }

    public void setOuterSkuId(String outerSkuId) {
        this.outerSkuId = outerSkuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getJdPrice() {
        return jdPrice;
    }

    public void setJdPrice(String jdPrice) {
        this.jdPrice = jdPrice;
    }

    public String getGiftPoint() {
        return giftPoint;
    }

    public void setGiftPoint(String giftPoint) {
        this.giftPoint = giftPoint;
    }

    public String getWareId() {
        return wareId;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    public String getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(String itemTotal) {
        this.itemTotal = itemTotal;
    }

    private String skuId;
    private String outerSkuId;
    private String skuName;
    private String jdPrice;
    private String giftPoint;
    private String wareId;
    private String itemTotal;
    private String productNo;
}
