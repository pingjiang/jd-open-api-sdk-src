// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PromotionSearchResponse.java

package com.jd.open.api.sdk.response.promotion;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.promotion:
//            PromotionSearch

public class PromotionSearchResponse extends AbstractResponse {

    public PromotionSearchResponse() {
    }

    public PromotionSearch getPromotionSearch() {
        return promotionSearch;
    }

    public void setPromotionSearch(PromotionSearch promotionSearch) {
        this.promotionSearch = promotionSearch;
    }

    private PromotionSearch promotionSearch;
}
