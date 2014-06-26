// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareSkusGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareSkusGetResponse extends AbstractResponse {

    public WareSkusGetResponse() {
    }

    public List getSkus() {
        return skus;
    }

    public void setSkus(List skus) {
        this.skus = skus;
    }

    private List skus;
}
