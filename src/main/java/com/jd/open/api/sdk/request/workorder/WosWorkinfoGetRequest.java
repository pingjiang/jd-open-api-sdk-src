// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WosWorkinfoGetRequest.java

package com.jd.open.api.sdk.request.workorder;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WosWorkinfoGetRequest extends AbstractRequest
        implements JdRequest {

    public WosWorkinfoGetRequest() {
    }

    public void setWorkId(Long workId) {
        this.workId = workId;
    }

    public Long getWorkId() {
        return workId;
    }

    public String getApiMethod() {
        return "jingdong.wos.workinfo.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("work_id", workId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.workorder.WosWorkinfoGetResponse.class;
    }

    private Long workId;
}
