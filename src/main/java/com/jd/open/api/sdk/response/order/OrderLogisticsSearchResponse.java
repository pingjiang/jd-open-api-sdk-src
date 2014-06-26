// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderLogisticsSearchResponse.java

package com.jd.open.api.sdk.response.order;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class OrderLogisticsSearchResponse extends AbstractResponse {

    public OrderLogisticsSearchResponse() {
    }

    public List getOrders() {
        return orders;
    }

    public void setOrders(List orders) {
        this.orders = orders;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private List orders;
    private int total;
}
