// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsO2oOrderQueryAfsRequest.java

package com.jd.open.api.sdk.request.O2O;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsO2oOrderQueryAfsRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsO2oOrderQueryAfsRequest() {
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

    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderState(String customerOrderState) {
        this.customerOrderState = customerOrderState;
    }

    public String getCustomerOrderState() {
        return customerOrderState;
    }

    public void setCustomerOrderTimeStart(String customerOrderTimeStart) {
        this.customerOrderTimeStart = customerOrderTimeStart;
    }

    public String getCustomerOrderTimeStart() {
        return customerOrderTimeStart;
    }

    public void setCustomerOrderTimeEnd(String customerOrderTimeEnd) {
        this.customerOrderTimeEnd = customerOrderTimeEnd;
    }

    public String getCustomerOrderTimeEnd() {
        return customerOrderTimeEnd;
    }

    public void setCustomerOrderUpdateTimeStart(String customerOrderUpdateTimeStart) {
        this.customerOrderUpdateTimeStart = customerOrderUpdateTimeStart;
    }

    public String getCustomerOrderUpdateTimeStart() {
        return customerOrderUpdateTimeStart;
    }

    public void setCustomerOrderUpdateTimeEnd(String customerOrderUpdateTimeEnd) {
        this.customerOrderUpdateTimeEnd = customerOrderUpdateTimeEnd;
    }

    public String getCustomerOrderUpdateTimeEnd() {
        return customerOrderUpdateTimeEnd;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getApiMethod() {
        return "jingdong.logistics.o2o.order.queryAfs";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("station_no", stationNo);
        pmap.put("order_id", orderId);
        pmap.put("customer_order_id", customerOrderId);
        pmap.put("customer_order_state", customerOrderState);
        pmap.put("customer_order_time_start", customerOrderTimeStart);
        pmap.put("customer_order_time_end", customerOrderTimeEnd);
        pmap.put("customer_order_update_time_start", customerOrderUpdateTimeStart);
        pmap.put("customer_order_update_time_end", customerOrderUpdateTimeEnd);
        pmap.put("current_page", Integer.valueOf(currentPage));
        pmap.put("page_num", Integer.valueOf(pageNum));
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.O2O.LogisticsO2oOrderQueryAfsResponse.class;
    }

    private String stationNo;
    private String orderId;
    private String customerOrderId;
    private String customerOrderState;
    private String customerOrderTimeStart;
    private String customerOrderTimeEnd;
    private String customerOrderUpdateTimeStart;
    private String customerOrderUpdateTimeEnd;
    private int currentPage;
    private int pageNum;
}
