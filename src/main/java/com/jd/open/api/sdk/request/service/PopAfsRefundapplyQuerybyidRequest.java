// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PopAfsRefundapplyQuerybyidRequest.java

package com.jd.open.api.sdk.request.service;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopAfsRefundapplyQuerybyidRequest extends AbstractRequest
        implements JdRequest {

    public PopAfsRefundapplyQuerybyidRequest() {
    }

    public void setRaId(Long raId) {
        this.raId = raId;
    }

    public Long getRaId() {
        return raId;
    }

    public String getApiMethod() {
        return "jingdong.pop.afs.refundapply.querybyid";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("ra_id", raId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.service.PopAfsRefundapplyQuerybyidResponse.class;
    }

    private Long raId;
}
