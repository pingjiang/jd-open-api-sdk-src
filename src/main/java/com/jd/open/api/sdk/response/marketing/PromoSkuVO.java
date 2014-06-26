// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PromoSkuVO.java

package com.jd.open.api.sdk.response.marketing;

import java.io.Serializable;

public class PromoSkuVO
        implements Serializable {

    public PromoSkuVO() {
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setItemNum(String itemNum) {
        this.itemNum = itemNum;
    }

    public String getItemNum() {
        return itemNum;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setPromoId(Long promoId) {
        this.promoId = promoId;
    }

    public Long getPromoId() {
        return promoId;
    }

    public void setJdPrice(String jdPrice) {
        this.jdPrice = jdPrice;
    }

    public String getJdPrice() {
        return jdPrice;
    }

    public void setPromoPrice(String promoPrice) {
        this.promoPrice = promoPrice;
    }

    public String getPromoPrice() {
        return promoPrice;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setBindType(Integer bindType) {
        this.bindType = bindType;
    }

    public Integer getBindType() {
        return bindType;
    }

    private Long wareId;
    private String itemNum;
    private Long skuId;
    private String skuName;
    private Long promoId;
    private String jdPrice;
    private String promoPrice;
    private Integer seq;
    private Integer num;
    private Integer bindType;
}
