// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceOriginalorderidGetRequest.java

package com.jd.open.api.sdk.request.service;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AfsserviceOriginalorderidGetRequest extends AbstractRequest
        implements JdRequest {

    public AfsserviceOriginalorderidGetRequest() {
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getApiMethod() {
        return "jingdong.afsservice.originalorderid.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("orderId", orderId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.service.AfsserviceOriginalorderidGetResponse.class;
    }

    private Long orderId;
}
