// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DropshipDpsDeliveryRequest.java

package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsDeliveryRequest extends AbstractRequest
        implements JdRequest {

    public DropshipDpsDeliveryRequest() {
    }

    public void setCustomOrderId(Long customOrderId) {
        this.customOrderId = customOrderId;
    }

    public Long getCustomOrderId() {
        return customOrderId;
    }

    public void setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
    }

    public Integer getCarrierId() {
        return carrierId;
    }

    public void setCarrierBusinessName(String carrierBusinessName) {
        this.carrierBusinessName = carrierBusinessName;
    }

    public String getCarrierBusinessName() {
        return carrierBusinessName;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    public String getShipNo() {
        return shipNo;
    }

    public void setEstimateDate(Date estimateDate) {
        this.estimateDate = estimateDate;
    }

    public Date getEstimateDate() {
        return estimateDate;
    }

    public String getApiMethod() {
        return "jingdong.dropship.dps.delivery";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("customOrderId", customOrderId);
        pmap.put("carrierId", carrierId);
        pmap.put("carrierBusinessName", carrierBusinessName);
        pmap.put("shipNo", shipNo);
        try {
            if (estimateDate != null)
                pmap.put("estimateDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(estimateDate));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.supplier.DropshipDpsDeliveryResponse.class;
    }

    private Long customOrderId;
    private Integer carrierId;
    private String carrierBusinessName;
    private String shipNo;
    private Date estimateDate;
}
