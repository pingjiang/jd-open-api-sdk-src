// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AccountVO.java

package com.jd.open.api.sdk.domain.kuaiche.AccountJosService;

import java.io.Serializable;

public class AccountVO
        implements Serializable {

    public AccountVO() {
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
    }

    public String getAvailableAmount() {
        return availableAmount;
    }

    public void setFreezeAmount(String freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public String getFreezeAmount() {
        return freezeAmount;
    }

    private String totalAmount;
    private String availableAmount;
    private String freezeAmount;
}
