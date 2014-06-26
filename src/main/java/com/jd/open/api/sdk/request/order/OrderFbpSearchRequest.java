// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderFbpSearchRequest.java

package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderFbpSearchRequest extends AbstractRequest
        implements JdRequest {

    public OrderFbpSearchRequest() {
    }

    public String getApiMethod() {
        return "360buy.order.fbp.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new TreeMap();
        map.put("start_date", startDate);
        map.put("end_date", endDate);
        map.put("page", page);
        map.put("page_size", pageSize);
        map.put("optional_fields", optionalFields);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.order.OrderFbpSearchResponse.class;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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

    public String getOptionalFields() {
        return optionalFields;
    }

    public void setOptionalFields(String optionalFields) {
        this.optionalFields = optionalFields;
    }

    private String startDate;
    private String endDate;
    private String page;
    private String pageSize;
    private String optionalFields;
}
