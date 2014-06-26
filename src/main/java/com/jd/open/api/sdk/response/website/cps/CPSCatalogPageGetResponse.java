// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CPSCatalogPageGetResponse.java

package com.jd.open.api.sdk.response.website.cps;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class CPSCatalogPageGetResponse extends AbstractResponse {

    public CPSCatalogPageGetResponse() {
    }

    public List getPromoteWares() {
        return promoteWares;
    }

    public void setPromoteWares(List promoteWares) {
        this.promoteWares = promoteWares;
    }

    private List promoteWares;
}
