// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TimeGetRequest.java

package com.jd.open.api.sdk.request.tools;

import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.TreeMap;

public class TimeGetRequest extends AbstractRequest
        implements JdRequest {

    public TimeGetRequest() {
    }

    public String getApiMethod() {
        return "360buy.time.get";
    }

    public String getAppJsonParams()
            throws IOException {
        java.util.Map map = new TreeMap();
        return null;
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.tools.TimeGetResponse.class;
    }
}
