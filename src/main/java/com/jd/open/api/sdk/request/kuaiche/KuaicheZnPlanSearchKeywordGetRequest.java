// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnPlanSearchKeywordGetRequest.java

package com.jd.open.api.sdk.request.kuaiche;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class KuaicheZnPlanSearchKeywordGetRequest extends AbstractRequest
        implements JdRequest {

    public KuaicheZnPlanSearchKeywordGetRequest() {
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Long getPlanId() {
        return planId;
    }

    public String getApiMethod() {
        return "jingdong.kuaiche.zn.plan.search.keyword.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("plan_id", planId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.kuaiche.KuaicheZnPlanSearchKeywordGetResponse.class;
    }

    private Long planId;
}
