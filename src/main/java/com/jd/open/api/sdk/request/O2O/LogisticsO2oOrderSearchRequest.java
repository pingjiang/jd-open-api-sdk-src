// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsO2oOrderSearchRequest.java

package com.jd.open.api.sdk.request.O2O;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsO2oOrderSearchRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsO2oOrderSearchRequest() {
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

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderTimeStart(String orderTimeStart) {
        this.orderTimeStart = orderTimeStart;
    }

    public String getOrderTimeStart() {
        return orderTimeStart;
    }

    public void setOrderTimeEnd(String orderTimeEnd) {
        this.orderTimeEnd = orderTimeEnd;
    }

    public String getOrderTimeEnd() {
        return orderTimeEnd;
    }

    public void setOrderUpdateTimeStart(String orderUpdateTimeStart) {
        this.orderUpdateTimeStart = orderUpdateTimeStart;
    }

    public String getOrderUpdateTimeStart() {
        return orderUpdateTimeStart;
    }

    public void setOrderUpdateTimeEnd(String orderUpdateTimeEnd) {
        this.orderUpdateTimeEnd = orderUpdateTimeEnd;
    }

    public String getOrderUpdateTimeEnd() {
        return orderUpdateTimeEnd;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public String getApiMethod() {
        return "jingdong.logistics.o2o.order.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("station_no", stationNo);
        pmap.put("order_id", orderId);
        pmap.put("order_state", orderState);
        pmap.put("order_time_start", orderTimeStart);
        pmap.put("order_time_end", orderTimeEnd);
        pmap.put("order_update_time_start", orderUpdateTimeStart);
        pmap.put("order_update_time_end", orderUpdateTimeEnd);
        pmap.put("current_page", Integer.valueOf(currentPage));
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.O2O.LogisticsO2oOrderSearchResponse.class;
    }

    private String stationNo;
    private String orderId;
    private String orderState;
    private String orderTimeStart;
    private String orderTimeEnd;
    private String orderUpdateTimeStart;
    private String orderUpdateTimeEnd;
    private int currentPage;
}
