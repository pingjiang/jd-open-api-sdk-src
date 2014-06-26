// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareSearchByCidRequst.java

package com.jd.open.api.sdk.request.website.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.website.ware.WareSearchByCidResponse;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSearchByCidRequst extends AbstractRequest
        implements JdRequest {

    public WareSearchByCidRequst() {
    }

    public String getApiMethod() {
        return "jingdong.wares.searchbycid";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("cid", cid);
        pmap.put("page", page);
        pmap.put("page_size", pageSize);
        pmap.put("fields", fields);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return WareSearchByCidResponse.class;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
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

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    private String cid;
    private String page;
    private String pageSize;
    private String fields;
}
