// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsPoGetRequest.java

package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsPoGetRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsPoGetRequest() {
    }

    public void setInboundNo(String inboundNo) {
        this.inboundNo = inboundNo;
    }

    public String getInboundNo() {
        return inboundNo;
    }

    public String getApiMethod() {
        return "jingdong.logistics.po.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("inbound_no", inboundNo);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.wms.LogisticsPoGetResponse.class;
    }

    private String inboundNo;
}
