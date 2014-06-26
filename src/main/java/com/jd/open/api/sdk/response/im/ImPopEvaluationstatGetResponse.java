// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImPopEvaluationstatGetResponse.java

package com.jd.open.api.sdk.response.im;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class ImPopEvaluationstatGetResponse extends AbstractResponse {

    public ImPopEvaluationstatGetResponse() {
    }

    public void setWaiterDailyEvaStat(List WaiterDailyEvaStat) {
        this.WaiterDailyEvaStat = WaiterDailyEvaStat;
    }

    public List getWaiterDailyEvaStat() {
        return WaiterDailyEvaStat;
    }

    private List WaiterDailyEvaStat;
}
