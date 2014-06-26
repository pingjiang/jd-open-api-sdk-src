// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderCanBuyTownRequest.java

package com.jd.open.api.sdk.domain.website.request;

import com.jd.open.api.sdk.domain.website.response.OrderCanBuyTownResponse;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrderCanBuyTownRequest extends AbstractRequest
        implements JdRequest {

    public OrderCanBuyTownRequest() {
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

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getApiMethod() {
        return "jingdong.order.support.town";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new HashMap();
        map.put("skus_info", skusInfo);
        map.put("buyer_name", buyerName);
        map.put("area_id", areaId);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return OrderCanBuyTownResponse.class;
    }

    private String skusInfo;
    private String buyerName;
    private String areaId;
}
