// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImPopUnreplystatGetResponse.java

package com.jd.open.api.sdk.response.im;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class ImPopUnreplystatGetResponse extends AbstractResponse {

    public ImPopUnreplystatGetResponse() {
    }

    public void setWaiterDailyStat(List WaiterDailyStat) {
        this.WaiterDailyStat = WaiterDailyStat;
    }

    public List getWaiterDailyStat() {
        return WaiterDailyStat;
    }

    private List WaiterDailyStat;
}
