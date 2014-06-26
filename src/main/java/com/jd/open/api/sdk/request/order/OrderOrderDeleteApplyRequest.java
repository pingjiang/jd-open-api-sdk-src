// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderOrderDeleteApplyRequest.java

package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderOrderDeleteApplyRequest extends AbstractRequest
        implements JdRequest {

    public OrderOrderDeleteApplyRequest() {
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setDelApplyType(int delApplyType) {
        this.delApplyType = delApplyType;
    }

    public int getDelApplyType() {
        return delApplyType;
    }

    public void setDelApplyReason(String delApplyReason) {
        this.delApplyReason = delApplyReason;
    }

    public String getDelApplyReason() {
        return delApplyReason;
    }

    public String getApiMethod() {
        return "jingdong.order.orderDelete.apply";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("order_id", Long.valueOf(orderId));
        pmap.put("del_apply_type", Integer.valueOf(delApplyType));
        pmap.put("del_apply_reason", delApplyReason);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.order.OrderOrderDeleteApplyResponse.class;
    }

    private long orderId;
    private int delApplyType;
    private String delApplyReason;
}
