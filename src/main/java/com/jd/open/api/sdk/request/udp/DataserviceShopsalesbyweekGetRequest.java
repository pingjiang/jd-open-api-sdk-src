// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DataserviceShopsalesbyweekGetRequest.java

package com.jd.open.api.sdk.request.udp;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DataserviceShopsalesbyweekGetRequest extends AbstractRequest
        implements JdRequest {

    public DataserviceShopsalesbyweekGetRequest() {
    }

    public void setTimeId(String timeId) {
        this.timeId = timeId;
    }

    public String getTimeId() {
        return timeId;
    }

    public String getApiMethod() {
        return "jingdong.dataservice.shopsalesbyweek.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("timeId", timeId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.udp.DataserviceShopsalesbyweekGetResponse.class;
    }

    private String timeId;
}
