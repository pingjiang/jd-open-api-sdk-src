// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfterSearchRequest.java

package com.jd.open.api.sdk.request.after;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AfterSearchRequest extends AbstractRequest
        implements JdRequest {

    public AfterSearchRequest() {
    }

    public AfterSearchRequest(List queryFields, String selectFields, String page, String pageSize) {
        this.queryFields = queryFields;
        this.selectFields = selectFields;
        this.page = page;
        this.pageSize = pageSize;
    }

    public String getApiMethod() {
        return "360buy.after.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new TreeMap();
        map.put("select_fields", selectFields);
        map.put("page", page);
        map.put("page_size", pageSize);
        map.put("query_fields", queryFields);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.after.AfterSearchResponse.class;
    }

    public List getQueryFields() {
        return queryFields;
    }

    public void setQueryFields(List queryFields) {
        this.queryFields = queryFields;
    }

    public String getSelectFields() {
        return selectFields;
    }

    public void setSelectFields(String selectFields) {
        this.selectFields = selectFields;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    private List queryFields;
    private String selectFields;
    private String page;
    private String pageSize;
}
