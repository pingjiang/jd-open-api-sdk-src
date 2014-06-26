// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeliveryLogisticsGetRequest.java

package com.jd.open.api.sdk.request.delivery;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DeliveryLogisticsGetRequest extends AbstractRequest
        implements JdRequest {

    public DeliveryLogisticsGetRequest() {
    }

    public String getApiMethod() {
        return "360buy.delivery.logistics.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new TreeMap();
        map.put("optional_fields", optionalFields);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.delivery.DeliveryLogisticsGetResponse.class;
    }

    public String getOptionalFields() {
        return optionalFields;
    }

    public void setOptionalFields(String optionalFields) {
        this.optionalFields = optionalFields;
    }

    private String optionalFields;
}
