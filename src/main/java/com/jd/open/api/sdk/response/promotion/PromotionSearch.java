// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PromotionSearch.java

package com.jd.open.api.sdk.response.promotion;

import java.util.List;

public class PromotionSearch {

    public PromotionSearch() {
    }

    public List getPromotionList() {
        return promotionList;
    }

    public void setPromotionList(List promotionList) {
        this.promotionList = promotionList;
    }

    public int getPromotionTotal() {
        return promotionTotal;
    }

    public void setPromotionTotal(int promotionTotal) {
        this.promotionTotal = promotionTotal;
    }

    private List promotionList;
    private int promotionTotal;
}
