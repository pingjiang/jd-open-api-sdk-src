// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PoListPageGetRequest.java

package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class PoListPageGetRequest extends AbstractRequest
        implements JdRequest {

    public PoListPageGetRequest() {
    }

    public void setDeliverCenterId(Integer deliverCenterId) {
        this.deliverCenterId = deliverCenterId;
    }

    public Integer getDeliverCenterId() {
        return deliverCenterId;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setCreatedDateStart(Date createdDateStart) {
        this.createdDateStart = createdDateStart;
    }

    public Date getCreatedDateStart() {
        return createdDateStart;
    }

    public void setCreatedDateEnd(Date createdDateEnd) {
        this.createdDateEnd = createdDateEnd;
    }

    public Date getCreatedDateEnd() {
        return createdDateEnd;
    }

    public void setIsEptCustomized(Boolean isEptCustomized) {
        this.isEptCustomized = isEptCustomized;
    }

    public Boolean getIsEptCustomized() {
        return isEptCustomized;
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

    public void setOrderIds(String orderIds) {
        this.orderIds = orderIds;
    }

    public String getOrderIds() {
        return orderIds;
    }

    public void setWareIds(String wareIds) {
        this.wareIds = wareIds;
    }

    public String getWareIds() {
        return wareIds;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getStates() {
        return states;
    }

    public void setConfirmStates(String confirmStates) {
        this.confirmStates = confirmStates;
    }

    public String getConfirmStates() {
        return confirmStates;
    }

    public void setOrderAttributes(String orderAttributes) {
        this.orderAttributes = orderAttributes;
    }

    public String getOrderAttributes() {
        return orderAttributes;
    }

    public String getApiMethod() {
        return "jingdong.po.list.page.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("deliverCenterId", deliverCenterId);
        pmap.put("status", status);
        try {
            if (createdDateStart != null)
                pmap.put("createdDateStart", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(createdDateStart));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (createdDateEnd != null)
                pmap.put("createdDateEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(createdDateEnd));
        } catch (Exception e) {
            e.printStackTrace();
        }
        pmap.put("isEptCustomized", isEptCustomized);
        pmap.put("pageIndex", pageIndex);
        pmap.put("pageSize", pageSize);
        pmap.put("orderIds", orderIds);
        pmap.put("wareIds", wareIds);
        pmap.put("states", states);
        pmap.put("confirmStates", confirmStates);
        pmap.put("orderAttributes", orderAttributes);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.supplier.PoListPageGetResponse.class;
    }

    private Integer deliverCenterId;
    private Integer status;
    private Date createdDateStart;
    private Date createdDateEnd;
    private Boolean isEptCustomized;
    private Integer pageIndex;
    private Integer pageSize;
    private String orderIds;
    private String wareIds;
    private String states;
    private String confirmStates;
    private String orderAttributes;
}
