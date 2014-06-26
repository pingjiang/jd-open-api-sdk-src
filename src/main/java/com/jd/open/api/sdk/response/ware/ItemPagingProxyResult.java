// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ItemPagingProxyResult.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;
import java.util.List;

public class ItemPagingProxyResult
        implements Serializable {

    public ItemPagingProxyResult() {
    }

    public void setItemProxyResults(List itemProxyResults) {
        this.itemProxyResults = itemProxyResults;
    }

    public List getItemProxyResults() {
        return itemProxyResults;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public int getTotalSize() {
        return totalSize;
    }

    private List itemProxyResults;
    private int totalSize;
}
