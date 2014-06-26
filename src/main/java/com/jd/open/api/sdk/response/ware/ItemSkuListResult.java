// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ItemSkuListResult.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;
import java.util.List;

public class ItemSkuListResult
        implements Serializable {

    public ItemSkuListResult() {
    }

    public void setItemSkuResult(List itemSkuResult) {
        this.itemSkuResult = itemSkuResult;
    }

    public List getItemSkuResult() {
        return itemSkuResult;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    private List itemSkuResult;
    private int total;
}
