// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsPoAddRequest.java

package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsPoAddRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsPoAddRequest() {
    }

    public void setChannelsSellerNo(String channelsSellerNo) {
        this.channelsSellerNo = channelsSellerNo;
    }

    public String getChannelsSellerNo() {
        return channelsSellerNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setExpectDate(String expectDate) {
        this.expectDate = expectDate;
    }

    public String getExpectDate() {
        return expectDate;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo;
    }

    public String getSupplierNo() {
        return supplierNo;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public String getApprover() {
        return approver;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsNo() {
        return goodsNo;
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
        return "jingdong.logistics.po.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("channels_seller_no", channelsSellerNo);
        pmap.put("po_no", poNo);
        pmap.put("warehouse_no", warehouseNo);
        pmap.put("expect_date", expectDate);
        pmap.put("supplier_name", supplierName);
        pmap.put("supplier_no", supplierNo);
        pmap.put("approver", approver);
        pmap.put("goods_no", goodsNo);
        pmap.put("expected_qty", expectedQty);
        pmap.put("goods_status", goodsStatus);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.wms.LogisticsPoAddResponse.class;
    }

    private String channelsSellerNo;
    private String poNo;
    private String warehouseNo;
    private String expectDate;
    private String supplierName;
    private String supplierNo;
    private String approver;
    private String goodsNo;
    private String expectedQty;
    private String goodsStatus;
}
