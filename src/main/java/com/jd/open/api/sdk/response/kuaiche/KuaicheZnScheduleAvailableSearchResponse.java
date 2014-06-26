// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnScheduleAvailableSearchResponse.java

package com.jd.open.api.sdk.response.kuaiche;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class KuaicheZnScheduleAvailableSearchResponse extends AbstractResponse {

    public KuaicheZnScheduleAvailableSearchResponse() {
    }

    public void setScheduleDayList(List scheduleDayList) {
        this.scheduleDayList = scheduleDayList;
    }

    public List getScheduleDayList() {
        return scheduleDayList;
    }

    private List scheduleDayList;
}
