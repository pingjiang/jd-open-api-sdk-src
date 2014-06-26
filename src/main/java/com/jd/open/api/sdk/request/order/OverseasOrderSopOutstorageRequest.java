// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OverseasOrderSopOutstorageRequest.java

package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OverseasOrderSopOutstorageRequest extends AbstractRequest
        implements JdRequest {

    public OverseasOrderSopOutstorageRequest() {
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getApiMethod() {
        return "360buy.overseas.order.sop.outstorage";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new TreeMap();
        map.put("order_id", orderId);
        map.put("trade_no", tradeNo);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.order.OverseasOrderSopOutstorageResponse.class;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    private String orderId;
    private String tradeNo;
}
