// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WarePropimgsSearchResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WarePropimgsSearchResponse extends AbstractResponse {

    public WarePropimgsSearchResponse() {
    }

    public List getWarePropimg() {
        return warePropimg;
    }

    public void setWarePropimg(List warePropimg) {
        this.warePropimg = warePropimg;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private List warePropimg;
    private int total;
}
