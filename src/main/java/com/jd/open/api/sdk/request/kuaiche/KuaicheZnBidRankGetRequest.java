// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnBidRankGetRequest.java

package com.jd.open.api.sdk.request.kuaiche;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class KuaicheZnBidRankGetRequest extends AbstractRequest
        implements JdRequest {

    public KuaicheZnBidRankGetRequest() {
    }

    public void setPlanJson(String planJson) {
        this.planJson = planJson;
    }

    public String getPlanJson() {
        return planJson;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return cid;
    }

    public void setKwgId(Long kwgId) {
        this.kwgId = kwgId;
    }

    public Long getKwgId() {
        return kwgId;
    }

    public void setPlanDate(String planDate) {
        this.planDate = planDate;
    }

    public String getPlanDate() {
        return planDate;
    }

    public String getApiMethod() {
        return "jingdong.kuaiche.zn.bid.rank.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("plan_json", planJson);
        pmap.put("cid", cid);
        pmap.put("kwg_id", kwgId);
        pmap.put("plan_date", planDate);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.kuaiche.KuaicheZnBidRankGetResponse.class;
    }

    private String planJson;
    private Long cid;
    private Long kwgId;
    private String planDate;
}
