// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareAreaLimitUpdateRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareAreaLimitUpdateRequest extends AbstractRequest
        implements JdRequest {

    public WareAreaLimitUpdateRequest() {
    }

    public String getApiMethod() {
        return "360buy.ware.area.limit.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("levs", levs);
        pmap.put("area_fids", areaFids);
        pmap.put("area_ids", areaIds);
        pmap.put("ware_id", wareId);
        pmap.put("type", type);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WareAreaLimitUpdateResponse.class;
    }

    public String getLevs() {
        return levs;
    }

    public void setLevs(String levs) {
        this.levs = levs;
    }

    public String getAreaIds() {
        return areaIds;
    }

    public void setAreaIds(String areaIds) {
        this.areaIds = areaIds;
    }

    public String getAreaFids() {
        return areaFids;
    }

    public void setAreaFids(String areaFids) {
        this.areaFids = areaFids;
    }

    public String getWareId() {
        return wareId;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String levs;
    private String areaIds;
    private String areaFids;
    private String wareId;
    private String type;
}
