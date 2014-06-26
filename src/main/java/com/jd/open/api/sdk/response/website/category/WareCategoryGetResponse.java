// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareCategoryGetResponse.java

package com.jd.open.api.sdk.response.website.category;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareCategoryGetResponse extends AbstractResponse {

    public WareCategoryGetResponse() {
    }

    public List getWareCategories() {
        return wareCategories;
    }

    public void setWareCategories(List wareCategories) {
        this.wareCategories = wareCategories;
    }

    private List wareCategories;
}
