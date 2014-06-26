// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RegionInfoGetRequest.java

package com.jd.open.api.sdk.request.website.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.website.ware.RegionInfoGetResponse;

import java.io.IOException;
import java.util.TreeMap;

public class RegionInfoGetRequest extends AbstractRequest
        implements JdRequest {

    public RegionInfoGetRequest() {
    }

    public String getApiMethod() {
        return "jingdong.regioninfo.get";
    }

    public String getAppJsonParams()
            throws IOException {
        java.util.Map pmap = new TreeMap();
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return RegionInfoGetResponse.class;
    }
}
