// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfterStateUpdateRequest.java

package com.jd.open.api.sdk.request.after;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AfterStateUpdateRequest extends AbstractRequest
        implements JdRequest {

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public AfterStateUpdateRequest() {
    }

    public AfterStateUpdateRequest(String returnId) {
        this.returnId = returnId;
    }

    public String getApiMethod() {
        return "360buy.after.state.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new TreeMap();
        map.put("return_id", returnId);
        map.put("trade_no", tradeNo);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.after.AfterStateUpdateResponse.class;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    private String returnId;
    private String tradeNo;
}
