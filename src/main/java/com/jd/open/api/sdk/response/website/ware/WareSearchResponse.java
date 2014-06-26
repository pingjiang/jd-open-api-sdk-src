// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareSearchResponse.java

package com.jd.open.api.sdk.response.website.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareSearchResponse extends AbstractResponse {

    public WareSearchResponse() {
    }

    public List getWareInfos() {
        return wareInfos;
    }

    public void setWareInfos(List wareInfos) {
        this.wareInfos = wareInfos;
    }

    private List wareInfos;
}
