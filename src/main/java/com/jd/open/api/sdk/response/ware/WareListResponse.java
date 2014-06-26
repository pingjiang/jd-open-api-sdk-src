// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareListResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareListResponse extends AbstractResponse {

    public WareListResponse() {
    }

    public List getWareList() {
        return wareList;
    }

    public void setWareList(List wareList) {
        this.wareList = wareList;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private List wareList;
    private int total;
}
