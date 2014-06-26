// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   POPGroup.java

package com.jd.open.api.sdk.response.im;

import java.io.Serializable;
import java.util.List;

public class POPGroup
        implements Serializable {

    public POPGroup() {
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setWaiterCount(int waiterCount) {
        this.waiterCount = waiterCount;
    }

    public int getWaiterCount() {
        return waiterCount;
    }

    public void setWaiterList(List waiterList) {
        this.waiterList = waiterList;
    }

    public List getWaiterList() {
        return waiterList;
    }

    private String shopName;
    private String shopUrl;
    private int waiterCount;
    private List waiterList;
}
