// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionSkuListResponse.java

package com.jd.open.api.sdk.response.marketing;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class SellerPromotionSkuListResponse extends AbstractResponse {

    public SellerPromotionSkuListResponse() {
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setPromoSkuVOS(List promoSkuVOS) {
        this.promoSkuVOS = promoSkuVOS;
    }

    public List getPromoSkuVOS() {
        return promoSkuVOS;
    }

    private Integer totalCount;
    private List promoSkuVOS;
}
