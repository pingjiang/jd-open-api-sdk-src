// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SdkMrCreateRequest.java

package com.jd.open.api.sdk.request.udp;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SdkMrCreateRequest extends AbstractRequest
        implements JdRequest {

    public SdkMrCreateRequest() {
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramName() {
        return programName;
    }

    public String getApiMethod() {
        return "jingdong.sdk.mr.create";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("programName", programName);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.udp.SdkMrCreateResponse.class;
    }

    private String programName;
}
