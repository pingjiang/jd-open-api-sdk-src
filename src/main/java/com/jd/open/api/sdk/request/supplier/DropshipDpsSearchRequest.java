// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DropshipDpsSearchRequest.java

package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsSearchRequest extends AbstractRequest
        implements JdRequest {

    public DropshipDpsSearchRequest() {
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPage() {
        return page;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getApiMethod() {
        return "jingdong.dropship.dps.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("pageSize", pageSize);
        pmap.put("page", page);
        try {
            if (beginDate != null)
                pmap.put("beginDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(beginDate));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (endDate != null)
                pmap.put("endDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(endDate));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.supplier.DropshipDpsSearchResponse.class;
    }

    private Integer pageSize;
    private Integer page;
    private Date beginDate;
    private Date endDate;
}
