// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnPlanChannelModifyRequest.java

package com.jd.open.api.sdk.request.kuaiche;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class KuaicheZnPlanChannelModifyRequest extends AbstractRequest
        implements JdRequest {

    public KuaicheZnPlanChannelModifyRequest() {
    }

    public void setPlanInfo(String planInfo) {
        this.planInfo = planInfo;
    }

    public String getPlanInfo() {
        return planInfo;
    }

    public String getApiMethod() {
        return "jingdong.kuaiche.zn.plan.channel.modify";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("plan_info", planInfo);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.kuaiche.KuaicheZnPlanChannelModifyResponse.class;
    }

    private String planInfo;
}
