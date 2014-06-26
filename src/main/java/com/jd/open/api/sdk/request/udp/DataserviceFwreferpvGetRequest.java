// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DataserviceFwreferpvGetRequest.java

package com.jd.open.api.sdk.request.udp;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DataserviceFwreferpvGetRequest extends AbstractRequest
        implements JdRequest {

    public DataserviceFwreferpvGetRequest() {
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setStat_dt(String stat_dt) {
        this.stat_dt = stat_dt;
    }

    public String getStat_dt() {
        return stat_dt;
    }

    public void setEnd_dt(String end_dt) {
        this.end_dt = end_dt;
    }

    public String getEnd_dt() {
        return end_dt;
    }

    public String getApiMethod() {
        return "jingdong.dataservice.fwreferpv.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("refer_url", url);
        pmap.put("stat_dt", stat_dt);
        pmap.put("end_dt", end_dt);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.udp.DataserviceFwreferpvGetResponse.class;
    }

    private String url;
    private String stat_dt;
    private String end_dt;
}
