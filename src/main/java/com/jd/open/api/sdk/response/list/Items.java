// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Items.java

package com.jd.open.api.sdk.response.list;

import java.io.Serializable;
import java.util.List;

public class Items
        implements Serializable {

    public Items() {
    }

    public void setItems(List items) {
        this.items = items;
    }

    public List getItems() {
        return items;
    }

    public void setItems2(List items2) {
        this.items2 = items2;
    }

    public List getItems2() {
        return items2;
    }

    public void setExpandSortValueName(String expandSortValueName) {
        this.expandSortValueName = expandSortValueName;
    }

    public String getExpandSortValueName() {
        return expandSortValueName;
    }

    private List items;
    private List items2;
    private String expandSortValueName;
}
