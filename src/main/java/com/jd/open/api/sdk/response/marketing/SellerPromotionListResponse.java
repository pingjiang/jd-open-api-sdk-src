// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionListResponse.java

package com.jd.open.api.sdk.response.marketing;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class SellerPromotionListResponse extends AbstractResponse {

    public SellerPromotionListResponse() {
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setPromotionVOS(List promotionVOS) {
        this.promotionVOS = promotionVOS;
    }

    public List getPromotionVOS() {
        return promotionVOS;
    }

    private Integer totalCount;
    private List promotionVOS;
}
