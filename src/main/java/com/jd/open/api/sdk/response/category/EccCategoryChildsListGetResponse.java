// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccCategoryChildsListGetResponse.java

package com.jd.open.api.sdk.response.category;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class EccCategoryChildsListGetResponse extends AbstractResponse {

    public EccCategoryChildsListGetResponse() {
    }

    public List getCategorys() {
        return categorys;
    }

    public void setCategorys(List categorys) {
        this.categorys = categorys;
    }

    private List categorys;
}
