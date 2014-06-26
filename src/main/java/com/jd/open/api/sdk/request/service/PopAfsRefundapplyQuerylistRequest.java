// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PopAfsRefundapplyQuerylistRequest.java

package com.jd.open.api.sdk.request.service;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopAfsRefundapplyQuerylistRequest extends AbstractRequest
        implements JdRequest {

    public PopAfsRefundapplyQuerylistRequest() {
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setApplyTimeStart(String applyTimeStart) {
        this.applyTimeStart = applyTimeStart;
    }

    public String getApplyTimeStart() {
        return applyTimeStart;
    }

    public void setApplyTimeEnd(String applyTimeEnd) {
        this.applyTimeEnd = applyTimeEnd;
    }

    public String getApplyTimeEnd() {
        return applyTimeEnd;
    }

    public void setCheckTimeStart(String checkTimeStart) {
        this.checkTimeStart = checkTimeStart;
    }

    public String getCheckTimeStart() {
        return checkTimeStart;
    }

    public void setCheckTimeEnd(String checkTimeEnd) {
        this.checkTimeEnd = checkTimeEnd;
    }

    public String getCheckTimeEnd() {
        return checkTimeEnd;
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
        return "jingdong.pop.afs.refundapply.querylist";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("status", status);
        pmap.put("id", id);
        pmap.put("order_id", orderId);
        pmap.put("buyer_id", buyerId);
        pmap.put("buyer_name", buyerName);
        pmap.put("apply_time_start", applyTimeStart);
        pmap.put("apply_time_end", applyTimeEnd);
        pmap.put("check_time_start", checkTimeStart);
        pmap.put("check_time_end", checkTimeEnd);
        pmap.put("page_index", pageIndex);
        pmap.put("page_size", pageSize);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.service.PopAfsRefundapplyQuerylistResponse.class;
    }

    private String status;
    private String id;
    private String orderId;
    private String buyerId;
    private String buyerName;
    private String applyTimeStart;
    private String applyTimeEnd;
    private String checkTimeStart;
    private String checkTimeEnd;
    private Integer pageIndex;
    private Integer pageSize;
}
