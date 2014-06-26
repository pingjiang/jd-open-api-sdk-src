// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImPopWaiterOnlinetimeStatGetResponse.java

package com.jd.open.api.sdk.response.im;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class ImPopWaiterOnlinetimeStatGetResponse extends AbstractResponse {

    public ImPopWaiterOnlinetimeStatGetResponse() {
    }

    public void setWaiterDailyStat(List WaiterDailyStat) {
        this.WaiterDailyStat = WaiterDailyStat;
    }

    public List getWaiterDailyStat() {
        return WaiterDailyStat;
    }

    private List WaiterDailyStat;
}
