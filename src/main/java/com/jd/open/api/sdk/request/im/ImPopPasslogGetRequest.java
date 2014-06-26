// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImPopPasslogGetRequest.java

package com.jd.open.api.sdk.request.im;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ImPopPasslogGetRequest extends AbstractRequest
        implements JdRequest {

    public ImPopPasslogGetRequest() {
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public String getApiMethod() {
        return "jingdong.im.pop.passlog.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("waiter", waiter);
        try {
            if (startTime != null)
                pmap.put("startTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(startTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (endTime != null)
                pmap.put("endTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(endTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
        pmap.put("page", Integer.valueOf(page));
        pmap.put("pageSize", Integer.valueOf(pageSize));
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.im.ImPopPasslogGetResponse.class;
    }

    private String waiter;
    private Date startTime;
    private Date endTime;
    private int page;
    private int pageSize;
}
