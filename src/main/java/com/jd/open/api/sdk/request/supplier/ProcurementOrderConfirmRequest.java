// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProcurementOrderConfirmRequest.java

package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ProcurementOrderConfirmRequest extends AbstractRequest
        implements JdRequest {

    public ProcurementOrderConfirmRequest() {
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    public String getWareId() {
        return wareId;
    }

    public void setDeliverCenterId(String deliverCenterId) {
        this.deliverCenterId = deliverCenterId;
    }

    public String getDeliverCenterId() {
        return deliverCenterId;
    }

    public void setBackExplanationType(String backExplanationType) {
        this.backExplanationType = backExplanationType;
    }

    public String getBackExplanationType() {
        return backExplanationType;
    }

    public void setConfirmNum(String confirmNum) {
        this.confirmNum = confirmNum;
    }

    public String getConfirmNum() {
        return confirmNum;
    }

    public String getApiMethod() {
        return "jingdong.procurement.order.confirm";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("orderId", orderId);
        try {
            if (deliveryTime != null)
                pmap.put("deliveryTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(deliveryTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
        pmap.put("wareId", wareId);
        pmap.put("deliverCenterId", deliverCenterId);
        pmap.put("backExplanationType", backExplanationType);
        pmap.put("confirmNum", confirmNum);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.supplier.ProcurementOrderConfirmResponse.class;
    }

    private Long orderId;
    private Date deliveryTime;
    private String wareId;
    private String deliverCenterId;
    private String backExplanationType;
    private String confirmNum;
}
