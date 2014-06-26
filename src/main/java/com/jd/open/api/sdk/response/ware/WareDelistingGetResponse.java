// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareDelistingGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareDelistingGetResponse extends AbstractResponse {

    public WareDelistingGetResponse() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List getWareInfos() {
        return wareInfos;
    }

    public void setWareInfos(List wareInfos) {
        this.wareInfos = wareInfos;
    }

    private List wareInfos;
    private int total;
}
