// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SdkMrDebugRequest.java

package com.jd.open.api.sdk.request.udp;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SdkMrDebugRequest extends AbstractRequest
        implements JdRequest {

    public SdkMrDebugRequest() {
    }

    public void setProgramIdOrName(String programIdOrName) {
        this.programIdOrName = programIdOrName;
    }

    public String getProgramIdOrName() {
        return programIdOrName;
    }

    public void setRunDay(String runDay) {
        this.runDay = runDay;
    }

    public String getRunDay() {
        return runDay;
    }

    public String getApiMethod() {
        return "jingdong.sdk.mr.debug";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("programIdOrName", programIdOrName);
        pmap.put("runDay", runDay);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.udp.SdkMrDebugResponse.class;
    }

    private String programIdOrName;
    private String runDay;
}
