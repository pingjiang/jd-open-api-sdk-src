// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BrandsGetResponse.java

package com.jd.open.api.sdk.response.category;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class BrandsGetResponse extends AbstractResponse {

    public BrandsGetResponse() {
    }

    public List getBrands() {
        return brands;
    }

    public void setBrands(List brands) {
        this.brands = brands;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private List brands;
    private int total;
}
