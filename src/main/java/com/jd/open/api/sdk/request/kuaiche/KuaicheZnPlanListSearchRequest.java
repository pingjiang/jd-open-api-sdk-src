// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnPlanListSearchRequest.java

package com.jd.open.api.sdk.request.kuaiche;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class KuaicheZnPlanListSearchRequest extends AbstractRequest
        implements JdRequest {

    public KuaicheZnPlanListSearchRequest() {
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanName() {
        return planName;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setIsQueryByStatus(String isQueryByStatus) {
        this.isQueryByStatus = isQueryByStatus;
    }

    public String getIsQueryByStatus() {
        return isQueryByStatus;
    }

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    public Integer getBegin() {
        return begin;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Integer getEnd() {
        return end;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public String getApiMethod() {
        return "jingdong.kuaiche.zn.plan.list.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("plan_name", planName);
        pmap.put("mode", mode);
        pmap.put("status", status);
        pmap.put("is_query_by_status", isQueryByStatus);
        pmap.put("begin", begin);
        pmap.put("end", end);
        pmap.put("page_size", pageSize);
        pmap.put("page_index", pageIndex);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.kuaiche.KuaicheZnPlanListSearchResponse.class;
    }

    private String planName;
    private String mode;
    private Integer status;
    private String isQueryByStatus;
    private Integer begin;
    private Integer end;
    private Integer pageSize;
    private Integer pageIndex;
}
