// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareSkuAddRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSkuAddRequest extends AbstractRequest
        implements JdRequest {

    public WareSkuAddRequest() {
    }

    public String getApiMethod() {
        return "360buy.ware.sku.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("ware_id", wareId);
        pmap.put("attributes", attributes);
        pmap.put("stock_num", stockNum);
        pmap.put("jd_price", jdPrice);
        pmap.put("trade_no", tradeNo);
        pmap.put("outer_id", outerId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WareSkuAddResponse.class;
    }

    public String getWareId() {
        return wareId;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getJdPrice() {
        return jdPrice;
    }

    public void setJdPrice(String jdPrice) {
        this.jdPrice = jdPrice;
    }

    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getStockNum() {
        return stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    private String wareId;
    private String attributes;
    private String jdPrice;
    private String stockNum;
    private String tradeNo;
    private String outerId;
}
