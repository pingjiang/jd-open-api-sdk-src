// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionPropListResponse.java

package com.jd.open.api.sdk.response.marketing;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class SellerPromotionPropListResponse extends AbstractResponse {

    public SellerPromotionPropListResponse() {
    }

    public void setPromoPropVOS(List promoPropVOS) {
        this.promoPropVOS = promoPropVOS;
    }

    public List getPromoPropVOS() {
        return promoPropVOS;
    }

    private List promoPropVOS;
}
