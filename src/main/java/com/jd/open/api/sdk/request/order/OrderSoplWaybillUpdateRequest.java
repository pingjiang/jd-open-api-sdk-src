// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderSoplWaybillUpdateRequest.java

package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderSoplWaybillUpdateRequest extends AbstractRequest
        implements JdRequest {

    public OrderSoplWaybillUpdateRequest() {
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getApiMethod() {
        return "360buy.order.sopl.waybill.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new TreeMap();
        map.put("order_id", orderId);
        map.put("logistics_id", logisticsId);
        map.put("waybill", waybill);
        map.put("trade_no", tradeNo);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.order.OrderSoplWaybillUpdateResponse.class;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    private String orderId;
    private String logisticsId;
    private String waybill;
    private String tradeNo;
}
