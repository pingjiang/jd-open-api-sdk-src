// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PageAllTask.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;
import java.util.List;

public class PageAllTask
        implements Serializable {

    public PageAllTask() {
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setResult(List result) {
        this.result = result;
    }

    public List getResult() {
        return result;
    }

    private int totalCount;
    private List result;
}
