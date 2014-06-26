// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceWaitprocesstaskGetRequest.java

package com.jd.open.api.sdk.request.service;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class AfsserviceWaitprocesstaskGetRequest extends AbstractRequest
        implements JdRequest {

    public AfsserviceWaitprocesstaskGetRequest() {
    }

    public void setAfsServiceId(Integer afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public Integer getAfsServiceId() {
        return afsServiceId;
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

    public void setCustomerPin(String customerPin) {
        this.customerPin = customerPin;
    }

    public String getCustomerPin() {
        return customerPin;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setAfsApplyTimeBegin(Date afsApplyTimeBegin) {
        this.afsApplyTimeBegin = afsApplyTimeBegin;
    }

    public Date getAfsApplyTimeBegin() {
        return afsApplyTimeBegin;
    }

    public void setAfsApplyTimeEnd(Date afsApplyTimeEnd) {
        this.afsApplyTimeEnd = afsApplyTimeEnd;
    }

    public Date getAfsApplyTimeEnd() {
        return afsApplyTimeEnd;
    }

    public void setApprovedDateBegin(Date approvedDateBegin) {
        this.approvedDateBegin = approvedDateBegin;
    }

    public Date getApprovedDateBegin() {
        return approvedDateBegin;
    }

    public void setApprovedDateEnd(Date approvedDateEnd) {
        this.approvedDateEnd = approvedDateEnd;
    }

    public Date getApprovedDateEnd() {
        return approvedDateEnd;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public String getApiMethod() {
        return "jingdong.afsservice.waitprocesstask.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("afsServiceId", afsServiceId);
        pmap.put("pageNumber", Integer.valueOf(pageNumber));
        pmap.put("pageSize", Integer.valueOf(pageSize));
        pmap.put("customerPin", customerPin);
        pmap.put("orderId", orderId);
        try {
            if (afsApplyTimeBegin != null)
                pmap.put("afsApplyTimeBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(afsApplyTimeBegin));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (afsApplyTimeEnd != null)
                pmap.put("afsApplyTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(afsApplyTimeEnd));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (approvedDateBegin != null)
                pmap.put("approvedDateBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(approvedDateBegin));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (approvedDateEnd != null)
                pmap.put("approvedDateEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(approvedDateEnd));
        } catch (Exception e) {
            e.printStackTrace();
        }
        pmap.put("expressCode", expressCode);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.service.AfsserviceWaitprocesstaskGetResponse.class;
    }

    private Integer afsServiceId;
    private int pageNumber;
    private int pageSize;
    private String customerPin;
    private Long orderId;
    private Date afsApplyTimeBegin;
    private Date afsApplyTimeEnd;
    private Date approvedDateBegin;
    private Date approvedDateEnd;
    private String expressCode;
}
