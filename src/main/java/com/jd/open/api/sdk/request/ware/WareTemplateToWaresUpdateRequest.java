// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareTemplateToWaresUpdateRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareTemplateToWaresUpdateRequest extends AbstractRequest
        implements JdRequest {

    public WareTemplateToWaresUpdateRequest() {
    }

    public String getApiMethod() {
        return "360buy.ware.template.to.wares.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("id", id);
        pmap.put("ware_ids", wareIds);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WareTemplateToWaresUpdateResponse.class;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWareIds() {
        return wareIds;
    }

    public void setWareIds(String wareIds) {
        this.wareIds = wareIds;
    }

    private String id;
    private String wareIds;
}
