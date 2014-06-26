// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderResult.java

package com.jd.open.api.sdk.domain.order;

import java.io.Serializable;
import java.util.List;

public class OrderResult
        implements Serializable {

    public OrderResult() {
    }

    public int getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(int orderTotal) {
        this.orderTotal = orderTotal;
    }

    public List getOrderInfoList() {
        return orderInfoList;
    }

    public void setOrderInfoList(List orderInfoList) {
        this.orderInfoList = orderInfoList;
    }

    private static final long serialVersionUID = 0x52dce14eL;
    private int orderTotal;
    private List orderInfoList;
}
