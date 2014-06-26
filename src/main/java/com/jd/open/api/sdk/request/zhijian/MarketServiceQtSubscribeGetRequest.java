// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MarketServiceQtSubscribeGetRequest.java

package com.jd.open.api.sdk.request.zhijian;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketServiceQtSubscribeGetRequest extends AbstractRequest
        implements JdRequest {

    public MarketServiceQtSubscribeGetRequest() {
    }

    public void setServiceItemCode(String serviceItemCode) {
        this.serviceItemCode = serviceItemCode;
    }

    public String getServiceItemCode() {
        return serviceItemCode;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public String getApiMethod() {
        return "jingdong.market.service.qt.subscribe.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("service_item_code", serviceItemCode);
        pmap.put("pin", pin);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.zhijian.MarketServiceQtSubscribeGetResponse.class;
    }

    private String serviceItemCode;
    private String pin;
}
