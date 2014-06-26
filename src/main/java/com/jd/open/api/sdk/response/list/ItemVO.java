// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ItemVO.java

package com.jd.open.api.sdk.response.list;

import java.io.Serializable;
import java.util.List;

public class ItemVO
        implements Serializable {

    public ItemVO() {
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setExpandSortsList(List expandSortsList) {
        this.expandSortsList = expandSortsList;
    }

    public List getExpandSortsList() {
        return expandSortsList;
    }

    private String type;
    private List expandSortsList;
}
