// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MarketServiceQtReportListGetRequest.java

package com.jd.open.api.sdk.request.zhijian;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketServiceQtReportListGetRequest extends AbstractRequest
        implements JdRequest {

    public MarketServiceQtReportListGetRequest() {
    }

    public void setServiceItemCode(String serviceItemCode) {
        this.serviceItemCode = serviceItemCode;
    }

    public String getServiceItemCode() {
        return serviceItemCode;
    }

    public void setQtType(Integer qtType) {
        this.qtType = qtType;
    }

    public Integer getQtType() {
        return qtType;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public String getSpName() {
        return spName;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public String getApiMethod() {
        return "jingdong.market.service.qt.report.list.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("service_item_code", serviceItemCode);
        pmap.put("qt_type", qtType);
        pmap.put("sp_name", spName);
        pmap.put("start_time", startTime);
        pmap.put("end_time", endTime);
        pmap.put("pin", pin);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.zhijian.MarketServiceQtReportListGetResponse.class;
    }

    private String serviceItemCode;
    private Integer qtType;
    private String spName;
    private String startTime;
    private String endTime;
    private String pin;
}
