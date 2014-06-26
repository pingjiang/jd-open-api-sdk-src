// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EtmsTraceGetRequest.java

package com.jd.open.api.sdk.request.delivery;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EtmsTraceGetRequest extends AbstractRequest
        implements JdRequest {

    public EtmsTraceGetRequest() {
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }

    public String getWaybillCode() {
        return waybillCode;
    }

    public String getApiMethod() {
        return "jingdong.etms.trace.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("waybillCode", waybillCode);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.delivery.EtmsTraceGetResponse.class;
    }

    private String waybillCode;
}
