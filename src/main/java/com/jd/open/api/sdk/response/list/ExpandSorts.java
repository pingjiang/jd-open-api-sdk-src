// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ExpandSorts.java

package com.jd.open.api.sdk.response.list;

import java.io.Serializable;

public class ExpandSorts
        implements Serializable {

    public ExpandSorts() {
    }

    public void setExpandValueId(Integer expandValueId) {
        this.expandValueId = expandValueId;
    }

    public Integer getExpandValueId() {
        return expandValueId;
    }

    public void setExpandSortValueName(String expandSortValueName) {
        this.expandSortValueName = expandSortValueName;
    }

    public String getExpandSortValueName() {
        return expandSortValueName;
    }

    private Integer expandValueId;
    private String expandSortValueName;
}
