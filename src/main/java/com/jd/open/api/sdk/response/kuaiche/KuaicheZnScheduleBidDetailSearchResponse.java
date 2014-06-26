// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnScheduleBidDetailSearchResponse.java

package com.jd.open.api.sdk.response.kuaiche;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class KuaicheZnScheduleBidDetailSearchResponse extends AbstractResponse {

    public KuaicheZnScheduleBidDetailSearchResponse() {
    }

    public void setScheduleList(List scheduleList) {
        this.scheduleList = scheduleList;
    }

    public List getScheduleList() {
        return scheduleList;
    }

    private List scheduleList;
}
