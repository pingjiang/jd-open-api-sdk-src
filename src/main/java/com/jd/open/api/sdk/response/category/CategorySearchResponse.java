// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CategorySearchResponse.java

package com.jd.open.api.sdk.response.category;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class CategorySearchResponse extends AbstractResponse {

    public CategorySearchResponse() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List getCategory() {
        return category;
    }

    public void setCategory(List category) {
        this.category = category;
    }

    private int total;
    private List category;
}
