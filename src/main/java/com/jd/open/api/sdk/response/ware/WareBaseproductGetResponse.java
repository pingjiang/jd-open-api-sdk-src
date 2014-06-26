// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareBaseproductGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareBaseproductGetResponse extends AbstractResponse {

    public WareBaseproductGetResponse() {
    }

    public void setProductBase(List productBase) {
        this.productBase = productBase;
    }

    public List getProductBase() {
        return productBase;
    }

    private List productBase;
}
