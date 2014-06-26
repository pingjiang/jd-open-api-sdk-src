// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccCategoryListGetResponse.java

package com.jd.open.api.sdk.response.category;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class EccCategoryListGetResponse extends AbstractResponse {

    public EccCategoryListGetResponse() {
    }

    public void setCategorys(List categorys) {
        this.categorys = categorys;
    }

    public List getCategorys() {
        return categorys;
    }

    private List categorys;
}
