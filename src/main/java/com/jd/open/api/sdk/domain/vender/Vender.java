// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Vender.java

package com.jd.open.api.sdk.domain.vender;

import java.io.Serializable;

public class Vender
        implements Serializable {

    public Vender() {
    }

    public long getVenderId() {
        return venderId;
    }

    public void setVenderId(long venderId) {
        this.venderId = venderId;
    }

    public int getColType() {
        return colType;
    }

    public void setColType(int colType) {
        this.colType = colType;
    }

    public int isSubAccount() {
        return subAccount;
    }

    public void setSubAccount(int subAccount) {
        this.subAccount = subAccount;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public int getCategoryMain() {
        return categoryMain;
    }

    public void setCategoryMain(int categoryMain) {
        this.categoryMain = categoryMain;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    private static final long serialVersionUID = 0x8a2eaed6L;
    private long venderId;
    private int colType;
    private int subAccount;
    private String accessCode;
    private int categoryMain;
    private String loginName;
    private String shopName;
    private long shopId;
}
