// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ItemVO2.java

package com.jd.open.api.sdk.response.list;

import java.io.Serializable;
import java.util.List;

public class ItemVO2
        implements Serializable {

    public ItemVO2() {
    }

    public void setExpandSortsList2(List expandSortsList2) {
        this.expandSortsList2 = expandSortsList2;
    }

    public List getExpandSortsList2() {
        return expandSortsList2;
    }

    private List expandSortsList2;
}
