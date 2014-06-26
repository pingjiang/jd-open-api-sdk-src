// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AdwordResponse.java

package com.jd.open.api.sdk.response.price;

import java.io.Serializable;
import java.util.List;

public class AdwordResponse
        implements Serializable {

    public AdwordResponse() {
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setPromotionInfoList(List promotionInfoList) {
        this.promotionInfoList = promotionInfoList;
    }

    public List getPromotionInfoList() {
        return promotionInfoList;
    }

    private String skuId;
    private List promotionInfoList;
}
