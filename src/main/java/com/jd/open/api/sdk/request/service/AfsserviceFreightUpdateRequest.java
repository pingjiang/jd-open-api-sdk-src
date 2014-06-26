// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceFreightUpdateRequest.java

package com.jd.open.api.sdk.request.service;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class AfsserviceFreightUpdateRequest extends AbstractRequest
        implements JdRequest {

    public AfsserviceFreightUpdateRequest() {
    }

    public void setAfsServiceId(Integer afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public Integer getAfsServiceId() {
        return afsServiceId;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setModifiedMoney(BigDecimal modifiedMoney) {
        this.modifiedMoney = modifiedMoney;
    }

    public BigDecimal getModifiedMoney() {
        return modifiedMoney;
    }

    public String getApiMethod() {
        return "jingdong.afsservice.freight.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("afsServiceId", afsServiceId);
        pmap.put("expressCode", expressCode);
        pmap.put("expressCompany", expressCompany);
        pmap.put("modifiedMoney", modifiedMoney);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.service.AfsserviceFreightUpdateResponse.class;
    }

    private Integer afsServiceId;
    private String expressCode;
    private String expressCompany;
    private BigDecimal modifiedMoney;
}
