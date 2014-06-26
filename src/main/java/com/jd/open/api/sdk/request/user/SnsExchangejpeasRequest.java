// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SnsExchangejpeasRequest.java

package com.jd.open.api.sdk.request.user;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SnsExchangejpeasRequest extends AbstractRequest
        implements JdRequest {

    public SnsExchangejpeasRequest() {
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setJpeas(Integer jpeas) {
        this.jpeas = jpeas;
    }

    public Integer getJpeas() {
        return jpeas;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public String getApiMethod() {
        return "jingdong.sns.exchangejpeas";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("clientId", clientId);
        pmap.put("businessId", businessId);
        pmap.put("key", key);
        pmap.put("signature", signature);
        pmap.put("integral", integral);
        pmap.put("jpeas", jpeas);
        pmap.put("remark", remark);
        pmap.put("status", status);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.user.SnsExchangejpeasResponse.class;
    }

    private String clientId;
    private String businessId;
    private String key;
    private String signature;
    private Integer integral;
    private Integer jpeas;
    private String remark;
    private Integer status;
}
