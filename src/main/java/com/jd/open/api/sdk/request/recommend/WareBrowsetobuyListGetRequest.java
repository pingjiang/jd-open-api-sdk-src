// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareBrowsetobuyListGetRequest.java

package com.jd.open.api.sdk.request.recommend;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareBrowsetobuyListGetRequest extends AbstractRequest
        implements JdRequest {

    public WareBrowsetobuyListGetRequest() {
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getClient() {
        return client;
    }

    public String getApiMethod() {
        return "jingdong.ware.browsetobuy.list.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("wareId", wareId);
        pmap.put("client", client);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.recommend.WareBrowsetobuyListGetResponse.class;
    }

    private Long wareId;
    private String client;
}
