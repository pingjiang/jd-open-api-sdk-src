// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WosWorklistGetRequest.java

package com.jd.open.api.sdk.request.workorder;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class WosWorklistGetRequest extends AbstractRequest
        implements JdRequest {

    public WosWorklistGetRequest() {
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
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

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public String getApiMethod() {
        return "jingdong.wos.worklist.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("status", status);
        pmap.put("order_id", orderId);
        try {
            if (beginDate != null)
                pmap.put("begin_date", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(beginDate));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (endDate != null)
                pmap.put("end_date", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(endDate));
        } catch (Exception e) {
            e.printStackTrace();
        }
        pmap.put("page_number", Integer.valueOf(pageNumber));
        pmap.put("page_size", Integer.valueOf(pageSize));
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.workorder.WosWorklistGetResponse.class;
    }

    private Integer status;
    private Long orderId;
    private Date beginDate;
    private Date endDate;
    private int pageNumber;
    private int pageSize;
}
