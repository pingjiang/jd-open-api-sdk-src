// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DropshipDpsOutboundRequest.java

package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsOutboundRequest extends AbstractRequest
        implements JdRequest {

    public DropshipDpsOutboundRequest() {
    }

    public void setCustomOrderId(Long customOrderId) {
        this.customOrderId = customOrderId;
    }

    public Long getCustomOrderId() {
        return customOrderId;
    }

    public String getApiMethod() {
        return "jingdong.dropship.dps.outbound";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("customOrderId", customOrderId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.supplier.DropshipDpsOutboundResponse.class;
    }

    private Long customOrderId;
}
