// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionActivitymodeAddResponse.java

package com.jd.open.api.sdk.response.marketing;

import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionActivitymodeAddResponse extends AbstractResponse {

    public SellerPromotionActivitymodeAddResponse() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    private Long id;
}
