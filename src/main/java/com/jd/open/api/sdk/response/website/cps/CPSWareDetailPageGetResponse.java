// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CPSWareDetailPageGetResponse.java

package com.jd.open.api.sdk.response.website.cps;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class CPSWareDetailPageGetResponse extends AbstractResponse {

    public CPSWareDetailPageGetResponse() {
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List getWareDetailList() {
        return wareDetailList;
    }

    public void setWareDetailList(List wareDetailList) {
        this.wareDetailList = wareDetailList;
    }

    private int totalCount;
    private List wareDetailList;
}
