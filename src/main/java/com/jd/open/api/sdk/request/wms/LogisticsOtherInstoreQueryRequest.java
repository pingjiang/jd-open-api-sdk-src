// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsOtherInstoreQueryRequest.java

package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsOtherInstoreQueryRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsOtherInstoreQueryRequest() {
    }

    public void setInBoundNo(String inBoundNo) {
        this.inBoundNo = inBoundNo;
    }

    public String getInBoundNo() {
        return inBoundNo;
    }

    public String getApiMethod() {
        return "jingdong.logistics.otherInstore.query";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("in_bound_no", inBoundNo);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.wms.LogisticsOtherInstoreQueryResponse.class;
    }

    private String inBoundNo;
}
