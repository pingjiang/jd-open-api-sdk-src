// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheAccountIncomexpenseSearchRequest.java

package com.jd.open.api.sdk.request.kuaiche;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class KuaicheAccountIncomexpenseSearchRequest extends AbstractRequest
        implements JdRequest {

    public KuaicheAccountIncomexpenseSearchRequest() {
    }

    public void setInOutType(Long inOutType) {
        this.inOutType = inOutType;
    }

    public Long getInOutType() {
        return inOutType;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return type;
    }

    public void setCheckType(Long checkType) {
        this.checkType = checkType;
    }

    public Long getCheckType() {
        return checkType;
    }

    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Long getPageIndex() {
        return pageIndex;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public String getApiMethod() {
        return "jingdong.kuaiche.account.incomexpense.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("in_out_type", inOutType);
        pmap.put("type", type);
        pmap.put("check_type", checkType);
        pmap.put("page_index", pageIndex);
        pmap.put("page_size", pageSize);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.kuaiche.KuaicheAccountIncomexpenseSearchResponse.class;
    }

    private Long inOutType;
    private Long type;
    private Long checkType;
    private Long pageIndex;
    private Long pageSize;
}
