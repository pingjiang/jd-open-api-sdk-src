// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionOrdermodeListResponse.java

package com.jd.open.api.sdk.response.marketing;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class SellerPromotionOrdermodeListResponse extends AbstractResponse {

    public SellerPromotionOrdermodeListResponse() {
    }

    public void setPromoOrderModeVOs(List promoOrderModeVOs) {
        this.promoOrderModeVOs = promoOrderModeVOs;
    }

    public List getPromoOrderModeVOs() {
        return promoOrderModeVOs;
    }

    private List promoOrderModeVOs;
}
