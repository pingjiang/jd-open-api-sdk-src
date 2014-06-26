// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsO2oOrderCarriageRequest.java

package com.jd.open.api.sdk.request.O2O;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsO2oOrderCarriageRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsO2oOrderCarriageRequest() {
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setCarrierNo(String carrierNo) {
        this.carrierNo = carrierNo;
    }

    public String getCarrierNo() {
        return carrierNo;
    }

    public void setDeliverNo(String deliverNo) {
        this.deliverNo = deliverNo;
    }

    public String getDeliverNo() {
        return deliverNo;
    }

    public String getApiMethod() {
        return "jingdong.logistics.o2o.order.carriage";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("order_id", orderId);
        pmap.put("carrier_no", carrierNo);
        pmap.put("deliver_no", deliverNo);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.O2O.LogisticsO2oOrderCarriageResponse.class;
    }

    private String orderId;
    private String carrierNo;
    private String deliverNo;
}
