// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderLbpOutstorageRequest.java

package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderLbpOutstorageRequest extends AbstractRequest
        implements JdRequest {

    public OrderLbpOutstorageRequest() {
        sendType = "1";
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getApiMethod() {
        return "360buy.order.lbp.outstorage";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new TreeMap();
        map.put("order_id", orderId);
        map.put("package_num", packageNum);
        map.put("send_type", sendType);
        map.put("logistics_id", logisticsId);
        map.put("waybill", waybill);
        map.put("trade_no", tradeNo);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.order.OrderLbpOutstorageResponse.class;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPackageNum() {
        return packageNum;
    }

    public void setPackageNum(String packageNum) {
        this.packageNum = packageNum;
    }

    private String getSendType() {
        return sendType;
    }

    private void setSendType(String sendType) {
        this.sendType = sendType;
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
    private String packageNum;
    private String sendType;
    private String logisticsId;
    private String waybill;
    private String tradeNo;
}
