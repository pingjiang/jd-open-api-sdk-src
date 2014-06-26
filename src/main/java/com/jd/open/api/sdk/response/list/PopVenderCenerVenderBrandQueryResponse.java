// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PopVenderCenerVenderBrandQueryResponse.java

package com.jd.open.api.sdk.response.list;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class PopVenderCenerVenderBrandQueryResponse extends AbstractResponse {

    public PopVenderCenerVenderBrandQueryResponse() {
    }

    public void setBrandList(List brandList) {
        this.brandList = brandList;
    }

    public List getBrandList() {
        return brandList;
    }

    private List brandList;
}
