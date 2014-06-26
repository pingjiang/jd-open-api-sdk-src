// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareSearchRequst.java

package com.jd.open.api.sdk.request.website.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.website.ware.WareSearchResponse;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSearchRequst extends AbstractRequest
        implements JdRequest {

    public WareSearchRequst() {
    }

    public String getApiMethod() {
        return "jingdong.wares.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("cid", cid);
        pmap.put("q", q);
        pmap.put("page", page);
        pmap.put("page_size", pageSize);
        pmap.put("fields", fields);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return WareSearchResponse.class;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
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
    private String q;
    private String page;
    private String pageSize;
    private String fields;
}
