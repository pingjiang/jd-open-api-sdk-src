// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BrowseBuyWidsList.java

package com.jd.open.api.sdk.response.recommend;

import java.io.Serializable;
import java.util.List;

public class BrowseBuyWidsList
        implements Serializable {

    public BrowseBuyWidsList() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setBrowseBuyWids(List browseBuyWids) {
        this.browseBuyWids = browseBuyWids;
    }

    public List getBrowseBuyWids() {
        return browseBuyWids;
    }

    private Integer resultCode;
    private List browseBuyWids;
}
