// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BuyToBuyWidsList.java

package com.jd.open.api.sdk.response.recommend;

import java.io.Serializable;
import java.util.List;

public class BuyToBuyWidsList
        implements Serializable {

    public BuyToBuyWidsList() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setBuyToBuyWids(List buyToBuyWids) {
        this.buyToBuyWids = buyToBuyWids;
    }

    public List getBuyToBuyWids() {
        return buyToBuyWids;
    }

    private Integer resultCode;
    private List buyToBuyWids;
}
