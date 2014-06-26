// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsO2oDispatchstatusUpdateRequest.java

package com.jd.open.api.sdk.request.O2O;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsO2oDispatchstatusUpdateRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsO2oDispatchstatusUpdateRequest() {
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

    public void setAntiDispatcherRemark(String antiDispatcherRemark) {
        this.antiDispatcherRemark = antiDispatcherRemark;
    }

    public String getAntiDispatcherRemark() {
        return antiDispatcherRemark;
    }

    public String getApiMethod() {
        return "jingdong.logistics.o2o.dispatchstatus.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("station_no", stationNo);
        pmap.put("order_id", orderId);
        pmap.put("state_operator", stateOperator);
        pmap.put("anti_dispatcher_remark", antiDispatcherRemark);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.O2O.LogisticsO2oDispatchstatusUpdateResponse.class;
    }

    private String stationNo;
    private String orderId;
    private String stateOperator;
    private String antiDispatcherRemark;
}
