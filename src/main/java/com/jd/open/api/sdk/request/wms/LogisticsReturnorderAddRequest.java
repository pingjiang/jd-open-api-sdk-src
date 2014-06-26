// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsReturnorderAddRequest.java

package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsReturnorderAddRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsReturnorderAddRequest() {
    }

    public void setSellerNo(String sellerNo) {
        this.sellerNo = sellerNo;
    }

    public String getSellerNo() {
        return sellerNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setInboundNo(String inboundNo) {
        this.inboundNo = inboundNo;
    }

    public String getInboundNo() {
        return inboundNo;
    }

    public void setJoslOutboundNo(String joslOutboundNo) {
        this.joslOutboundNo = joslOutboundNo;
    }

    public String getJoslOutboundNo() {
        return joslOutboundNo;
    }

    public void setExpectedDate(Date expectedDate) {
        this.expectedDate = expectedDate;
    }

    public Date getExpectedDate() {
        return expectedDate;
    }

    public void setIsvSource(String isvSource) {
        this.isvSource = isvSource;
    }

    public String getIsvSource() {
        return isvSource;
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

    public void setStockMark(String stockMark) {
        this.stockMark = stockMark;
    }

    public String getStockMark() {
        return stockMark;
    }

    public String getApiMethod() {
        return "jingdong.logistics.returnorder.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("seller_no", sellerNo);
        pmap.put("warehouse_no", warehouseNo);
        pmap.put("inbound_no", inboundNo);
        pmap.put("josl_outbound_no", joslOutboundNo);
        try {
            if (expectedDate != null)
                pmap.put("expected_date", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(expectedDate));
        } catch (Exception e) {
            e.printStackTrace();
        }
        pmap.put("isv_source", isvSource);
        pmap.put("approver", approver);
        pmap.put("goods_no", goodsNo);
        pmap.put("expected_qty", expectedQty);
        pmap.put("stock_mark", stockMark);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.wms.LogisticsReturnorderAddResponse.class;
    }

    private String sellerNo;
    private String warehouseNo;
    private String inboundNo;
    private String joslOutboundNo;
    private Date expectedDate;
    private String isvSource;
    private String approver;
    private String goodsNo;
    private String expectedQty;
    private String stockMark;
}
