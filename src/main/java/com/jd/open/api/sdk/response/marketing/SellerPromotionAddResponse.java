// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionAddResponse.java

package com.jd.open.api.sdk.response.marketing;

import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionAddResponse extends AbstractResponse {

    public SellerPromotionAddResponse() {
    }

    public void setPromoId(Long promoId) {
        this.promoId = promoId;
    }

    public Long getPromoId() {
        return promoId;
    }

    private Long promoId;
}
