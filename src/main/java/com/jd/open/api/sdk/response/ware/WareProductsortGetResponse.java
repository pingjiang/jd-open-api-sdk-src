// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareProductsortGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareProductsortGetResponse extends AbstractResponse {

    public WareProductsortGetResponse() {
    }

    public void setProductSorts(List productSorts) {
        this.productSorts = productSorts;
    }

    public List getProductSorts() {
        return productSorts;
    }

    private List productSorts;
}
