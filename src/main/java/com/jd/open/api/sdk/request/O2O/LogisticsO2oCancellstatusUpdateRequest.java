// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsO2oCancellstatusUpdateRequest.java

package com.jd.open.api.sdk.request.O2O;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsO2oCancellstatusUpdateRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsO2oCancellstatusUpdateRequest() {
    }

    public void setStationNo(String stationNo) {
        this.stationNo = stationNo;
    }

    public String getStationNo() {
        return stationNo;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setStateOperator(String stateOperator) {
        this.stateOperator = stateOperator;
    }

    public String getStateOperator() {
        return stateOperator;
    }

    public void setOrderCancelReason(String orderCancelReason) {
        this.orderCancelReason = orderCancelReason;
    }

    public String getOrderCancelReason() {
        return orderCancelReason;
    }

    public void setOrderCancelRemark(String orderCancelRemark) {
        this.orderCancelRemark = orderCancelRemark;
    }

    public String getOrderCancelRemark() {
        return orderCancelRemark;
    }

    public String getApiMethod() {
        return "jingdong.logistics.o2o.cancellstatus.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("station_no", stationNo);
        pmap.put("order_id", orderId);
        pmap.put("state_operator", stateOperator);
        pmap.put("order_cancel_reason", orderCancelReason);
        pmap.put("order_cancel_remark", orderCancelRemark);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.O2O.LogisticsO2oCancellstatusUpdateResponse.class;
    }

    private String stationNo;
    private String orderId;
    private String stateOperator;
    private String orderCancelReason;
    private String orderCancelRemark;
}
