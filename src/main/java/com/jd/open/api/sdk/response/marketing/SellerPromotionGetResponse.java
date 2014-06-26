// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionGetResponse.java

package com.jd.open.api.sdk.response.marketing;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.marketing:
//            PromotionVO

public class SellerPromotionGetResponse extends AbstractResponse {

    public SellerPromotionGetResponse() {
    }

    public void setPromotionVO(PromotionVO promotionVO) {
        this.promotionVO = promotionVO;
    }

    public PromotionVO getPromotionVO() {
        return promotionVO;
    }

    private PromotionVO promotionVO;
}
