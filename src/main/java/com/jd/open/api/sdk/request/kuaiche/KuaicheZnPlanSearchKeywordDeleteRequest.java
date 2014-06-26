// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnPlanSearchKeywordDeleteRequest.java

package com.jd.open.api.sdk.request.kuaiche;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class KuaicheZnPlanSearchKeywordDeleteRequest extends AbstractRequest
        implements JdRequest {

    public KuaicheZnPlanSearchKeywordDeleteRequest() {
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setKeywordIds(String keywordIds) {
        this.keywordIds = keywordIds;
    }

    public String getKeywordIds() {
        return keywordIds;
    }

    public String getApiMethod() {
        return "jingdong.kuaiche.zn.plan.search.keyword.delete";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("plan_id", planId);
        pmap.put("keyword_ids", keywordIds);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.kuaiche.KuaicheZnPlanSearchKeywordDeleteResponse.class;
    }

    private Long planId;
    private String keywordIds;
}
