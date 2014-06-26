// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderLogisticsSearchRequest.java

package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrderLogisticsSearchRequest extends AbstractRequest
        implements JdRequest {

    public OrderLogisticsSearchRequest() {
    }

    public String getApiMethod() {
        return "jingdong.logistics.orders.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new HashMap();
        map.put("vender_id", venderId);
        map.put("start_date", startDate);
        map.put("end_date", endDate);
        map.put("page", page);
        map.put("page_size", pageSize);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.order.OrderLogisticsSearchResponse.class;
    }

    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
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

    private String venderId;
    private String startDate;
    private String endDate;
    private String page;
    private String pageSize;
}
