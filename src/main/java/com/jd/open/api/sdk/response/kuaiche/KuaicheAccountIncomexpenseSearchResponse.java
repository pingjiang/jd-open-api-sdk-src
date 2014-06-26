// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheAccountIncomexpenseSearchResponse.java

package com.jd.open.api.sdk.response.kuaiche;

import com.jd.open.api.sdk.domain.kuaiche.AccountJosService.PageInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class KuaicheAccountIncomexpenseSearchResponse extends AbstractResponse {

    public KuaicheAccountIncomexpenseSearchResponse() {
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    private PageInfo pageInfo;
}
