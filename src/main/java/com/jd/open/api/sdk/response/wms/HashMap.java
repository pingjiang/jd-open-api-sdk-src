// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HashMap.java

package com.jd.open.api.sdk.response.wms;

import java.io.Serializable;
import java.util.List;

public class HashMap
        implements Serializable {

    public HashMap() {
    }

    public void setOrderList(List orderList) {
        this.orderList = orderList;
    }

    public List getOrderList() {
        return orderList;
    }

    private List orderList;
}
