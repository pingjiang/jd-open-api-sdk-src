// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderCanBuyAreaRequest.java

package com.jd.open.api.sdk.domain.website.request;

import com.jd.open.api.sdk.domain.website.response.OrderCanBuyAreaResponse;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrderCanBuyAreaRequest extends AbstractRequest
        implements JdRequest {

    public OrderCanBuyAreaRequest() {
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

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getApiMethod() {
        return "jingdong.order.support.area";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new HashMap();
        map.put("skus_info", skusInfo);
        map.put("buyer_name", buyerName);
        map.put("city_id", cityId);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return OrderCanBuyAreaResponse.class;
    }

    private String skusInfo;
    private String buyerName;
    private String cityId;
}
