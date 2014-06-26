// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareAreaLimitSearchResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareAreaLimitSearchResponse extends AbstractResponse {

    public WareAreaLimitSearchResponse() {
    }

    public List getWareAreaLimits() {
        return wareAreaLimits;
    }

    public void setWareAreaLimits(List wareAreaLimits) {
        this.wareAreaLimits = wareAreaLimits;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private List wareAreaLimits;
    private int total;
}
