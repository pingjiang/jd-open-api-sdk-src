// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsOtherOutstoreQueryRequest.java

package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsOtherOutstoreQueryRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsOtherOutstoreQueryRequest() {
    }

    public void setJoslOutboundNo(String joslOutboundNo) {
        this.joslOutboundNo = joslOutboundNo;
    }

    public String getJoslOutboundNo() {
        return joslOutboundNo;
    }

    public String getApiMethod() {
        return "jingdong.logistics.otherOutstore.query";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("josl_outbound_no", joslOutboundNo);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.wms.LogisticsOtherOutstoreQueryResponse.class;
    }

    private String joslOutboundNo;
}
