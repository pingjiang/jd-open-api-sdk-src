// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderCanBuyProvinceRequest.java

package com.jd.open.api.sdk.domain.website.request;

import com.jd.open.api.sdk.domain.website.response.OrderCanBuyProvinceResponse;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrderCanBuyProvinceRequest extends AbstractRequest
        implements JdRequest {

    public OrderCanBuyProvinceRequest() {
    }

    public String getSkusInfo() {
        return skusInfo;
    }

    public void setSkusInfo(String skusInfo) {
        this.skusInfo = skusInfo;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getApiMethod() {
        return "jingdong.order.support.province";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new HashMap();
        map.put("skus_info", skusInfo);
        map.put("buyer_name", buyerName);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return OrderCanBuyProvinceResponse.class;
    }

    private String skusInfo;
    private String buyerName;
}
