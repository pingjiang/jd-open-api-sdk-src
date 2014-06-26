// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnScheduleAvailableSearchRequest.java

package com.jd.open.api.sdk.request.kuaiche;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class KuaicheZnScheduleAvailableSearchRequest extends AbstractRequest
        implements JdRequest {

    public KuaicheZnScheduleAvailableSearchRequest() {
    }

    public void setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
    }

    public Long getSpaceId() {
        return spaceId;
    }

    public String getApiMethod() {
        return "jingdong.kuaiche.zn.schedule.available.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("space_id", spaceId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.kuaiche.KuaicheZnScheduleAvailableSearchResponse.class;
    }

    private Long spaceId;
}
