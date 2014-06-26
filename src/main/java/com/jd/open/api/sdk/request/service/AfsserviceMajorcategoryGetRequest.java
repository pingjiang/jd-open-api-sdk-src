// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceMajorcategoryGetRequest.java

package com.jd.open.api.sdk.request.service;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.TreeMap;

public class AfsserviceMajorcategoryGetRequest extends AbstractRequest
        implements JdRequest {

    public AfsserviceMajorcategoryGetRequest() {
    }

    public String getApiMethod() {
        return "jingdong.afsservice.majorcategory.get";
    }

    public String getAppJsonParams()
            throws IOException {
        java.util.Map pmap = new TreeMap();
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.service.AfsserviceMajorcategoryGetResponse.class;
    }
}
