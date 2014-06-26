// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReturnGoods.java

package com.jd.open.api.sdk.domain.after;

import java.io.Serializable;
import java.util.List;

public class ReturnGoods
        implements Serializable {

    public ReturnGoods() {
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public List getReturnInfos() {
        return returnInfos;
    }

    public void setReturnInfos(List returnInfos) {
        this.returnInfos = returnInfos;
    }

    private static final long serialVersionUID = 0xfcb3695eL;
    private int totalNum;
    private List returnInfos;
}
