// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderVenderRemarkQueryByOrderIdRequest.java

package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderVenderRemarkQueryByOrderIdRequest extends AbstractRequest
        implements JdRequest {

    public OrderVenderRemarkQueryByOrderIdRequest() {
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getOrderId() {
        return orderId;
    }

    public String getApiMethod() {
        return "jingdong.order.venderRemark.queryByOrderId";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("order_id", Long.valueOf(orderId));
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.order.OrderVenderRemarkQueryByOrderIdResponse.class;
    }

    private long orderId;
}
