// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MarketServiceQtReportUpdateRequest.java

package com.jd.open.api.sdk.request.zhijian;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketServiceQtReportUpdateRequest extends AbstractRequest
        implements JdRequest {

    public MarketServiceQtReportUpdateRequest() {
    }

    public void setServiceItemCode(String serviceItemCode) {
        this.serviceItemCode = serviceItemCode;
    }

    public String getServiceItemCode() {
        return serviceItemCode;
    }

    public void setQtCode(String qtCode) {
        this.qtCode = qtCode;
    }

    public String getQtCode() {
        return qtCode;
    }

    public void setQtName(String qtName) {
        this.qtName = qtName;
    }

    public String getQtName() {
        return qtName;
    }

    public void setQtType(Integer qtType) {
        this.qtType = qtType;
    }

    public Integer getQtType() {
        return qtType;
    }

    public void setQtStandard(String qtStandard) {
        this.qtStandard = qtStandard;
    }

    public String getQtStandard() {
        return qtStandard;
    }

    public void setIsPassed(Integer isPassed) {
        this.isPassed = isPassed;
    }

    public Integer getIsPassed() {
        return isPassed;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public String getSpName() {
        return spName;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setExtAttr(String extAttr) {
        this.extAttr = extAttr;
    }

    public String getExtAttr() {
        return extAttr;
    }

    public void setNumIid(Integer numIid) {
        this.numIid = numIid;
    }

    public Integer getNumIid() {
        return numIid;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public String getApiMethod() {
        return "jingdong.market.service.qt.report.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("service_item_code", serviceItemCode);
        pmap.put("qt_code", qtCode);
        pmap.put("qt_name", qtName);
        pmap.put("qt_type", qtType);
        pmap.put("qt_standard", qtStandard);
        pmap.put("is_passed", isPassed);
        pmap.put("sp_name", spName);
        pmap.put("message", message);
        pmap.put("submit_time", submitTime);
        pmap.put("report_time", reportTime);
        pmap.put("expiry_time", expiryTime);
        pmap.put("item_url", itemUrl);
        pmap.put("item_desc", itemDesc);
        pmap.put("report_url", reportUrl);
        pmap.put("ext_attr", extAttr);
        pmap.put("num_iid", numIid);
        pmap.put("status", status);
        pmap.put("pin", pin);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.zhijian.MarketServiceQtReportUpdateResponse.class;
    }

    private String serviceItemCode;
    private String qtCode;
    private String qtName;
    private Integer qtType;
    private String qtStandard;
    private Integer isPassed;
    private String spName;
    private String message;
    private String submitTime;
    private String reportTime;
    private String expiryTime;
    private String itemUrl;
    private String itemDesc;
    private String reportUrl;
    private String extAttr;
    private Integer numIid;
    private Integer status;
    private String pin;
}
