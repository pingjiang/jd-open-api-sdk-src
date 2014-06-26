// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CategoryAttributeValueSearchResponse.java

package com.jd.open.api.sdk.response.category;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class CategoryAttributeValueSearchResponse extends AbstractResponse {

    public CategoryAttributeValueSearchResponse() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List getAttValues() {
        return attValues;
    }

    public void setAttValues(List attValues) {
        this.attValues = attValues;
    }

    private int total;
    private List attValues;
}
