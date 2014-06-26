// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProcurementOrderCreateRequest.java

package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ProcurementOrderCreateRequest extends AbstractRequest
        implements JdRequest {

    public ProcurementOrderCreateRequest() {
    }

    public void setDeliverCenterId(Integer deliverCenterId) {
        this.deliverCenterId = deliverCenterId;
    }

    public Integer getDeliverCenterId() {
        return deliverCenterId;
    }

    public void setPurchaserErpCode(String purchaserErpCode) {
        this.purchaserErpCode = purchaserErpCode;
    }

    public String getPurchaserErpCode() {
        return purchaserErpCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    public String getWareId() {
        return wareId;
    }

    public void setAllocationDeliverCenterId(String allocationDeliverCenterId) {
        this.allocationDeliverCenterId = allocationDeliverCenterId;
    }

    public String getAllocationDeliverCenterId() {
        return allocationDeliverCenterId;
    }

    public void setOriginalNum(String originalNum) {
        this.originalNum = originalNum;
    }

    public String getOriginalNum() {
        return originalNum;
    }

    public String getApiMethod() {
        return "jingdong.procurement.order.create";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("deliverCenterId", deliverCenterId);
        pmap.put("purchaserErpCode", purchaserErpCode);
        pmap.put("remark", remark);
        pmap.put("wareId", wareId);
        pmap.put("allocationDeliverCenterId", allocationDeliverCenterId);
        pmap.put("originalNum", originalNum);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.supplier.ProcurementOrderCreateResponse.class;
    }

    private Integer deliverCenterId;
    private String purchaserErpCode;
    private String remark;
    private String wareId;
    private String allocationDeliverCenterId;
    private String originalNum;
}
