// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PoDetailPageGetRequest.java

package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PoDetailPageGetRequest extends AbstractRequest
        implements JdRequest {

    public PoDetailPageGetRequest() {
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setSortFiled(String sortFiled) {
        this.sortFiled = sortFiled;
    }

    public String getSortFiled() {
        return sortFiled;
    }

    public void setSortMode(String sortMode) {
        this.sortMode = sortMode;
    }

    public String getSortMode() {
        return sortMode;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public String getApiMethod() {
        return "jingdong.po.detail.page.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("orderId", orderId);
        pmap.put("sortFiled", sortFiled);
        pmap.put("sortMode", sortMode);
        pmap.put("pageIndex", pageIndex);
        pmap.put("pageSize", pageSize);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.supplier.PoDetailPageGetResponse.class;
    }

    private Long orderId;
    private String sortFiled;
    private String sortMode;
    private Integer pageIndex;
    private Integer pageSize;
}
