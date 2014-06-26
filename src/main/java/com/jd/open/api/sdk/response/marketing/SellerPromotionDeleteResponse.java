// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionDeleteResponse.java

package com.jd.open.api.sdk.response.marketing;

import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionDeleteResponse extends AbstractResponse {

    public SellerPromotionDeleteResponse() {
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    private int count;
}
