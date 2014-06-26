// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsOtherInstoreAddRequest.java

package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsOtherInstoreAddRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsOtherInstoreAddRequest() {
    }

    public void setInstoreType(String instoreType) {
        this.instoreType = instoreType;
    }

    public String getInstoreType() {
        return instoreType;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }

    public String getExpectedDate() {
        return expectedDate;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public String getApprover() {
        return approver;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setIsvGoodsNo(String isvGoodsNo) {
        this.isvGoodsNo = isvGoodsNo;
    }

    public String getIsvGoodsNo() {
        return isvGoodsNo;
    }

    public void setExpectedQty(String expectedQty) {
        this.expectedQty = expectedQty;
    }

    public String getExpectedQty() {
        return expectedQty;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public String getApiMethod() {
        return "jingdong.logistics.otherInstore.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("instore_type", instoreType);
        pmap.put("po_no", poNo);
        pmap.put("expected_date", expectedDate);
        pmap.put("approver", approver);
        pmap.put("warehouse_no", warehouseNo);
        pmap.put("goods_no", goodsNo);
        pmap.put("isv_goods_no", isvGoodsNo);
        pmap.put("expected_qty", expectedQty);
        pmap.put("goods_status", goodsStatus);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.wms.LogisticsOtherInstoreAddResponse.class;
    }

    private String instoreType;
    private String poNo;
    private String expectedDate;
    private String approver;
    private String warehouseNo;
    private String goodsNo;
    private String isvGoodsNo;
    private String expectedQty;
    private String goodsStatus;
}
