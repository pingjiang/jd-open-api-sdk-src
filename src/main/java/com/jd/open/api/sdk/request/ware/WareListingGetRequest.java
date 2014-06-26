// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareListingGetRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareListingGetRequest extends AbstractRequest
        implements JdRequest {

    public WareListingGetRequest() {
    }

    public String getApiMethod() {
        return "360buy.ware.listing.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("page", page);
        pmap.put("cid", cid);
        pmap.put("page_size", pageSize);
        pmap.put("end_modified", endModified);
        pmap.put("start_modified", startModified);
        pmap.put("fields", fields);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WareListingGetResponse.class;
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

    public String getEndModified() {
        return endModified;
    }

    public void setEndModified(String endModified) {
        this.endModified = endModified;
    }

    public String getStartModified() {
        return startModified;
    }

    public void setStartModified(String startModified) {
        this.startModified = startModified;
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
    private String endModified;
    private String startModified;
    private String fields;
}
