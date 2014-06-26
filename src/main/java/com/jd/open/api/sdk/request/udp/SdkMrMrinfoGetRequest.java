// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SdkMrMrinfoGetRequest.java

package com.jd.open.api.sdk.request.udp;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SdkMrMrinfoGetRequest extends AbstractRequest
        implements JdRequest {

    public SdkMrMrinfoGetRequest() {
    }

    public void setProgramIdOrName(String programIdOrName) {
        this.programIdOrName = programIdOrName;
    }

    public String getProgramIdOrName() {
        return programIdOrName;
    }

    public String getApiMethod() {
        return "jingdong.sdk.mr.mrinfo.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("programIdOrName", programIdOrName);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.udp.SdkMrMrinfoGetResponse.class;
    }

    private String programIdOrName;
}
