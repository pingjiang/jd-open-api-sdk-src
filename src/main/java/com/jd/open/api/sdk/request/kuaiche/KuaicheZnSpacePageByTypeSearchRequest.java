// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnSpacePageByTypeSearchRequest.java

package com.jd.open.api.sdk.request.kuaiche;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class KuaicheZnSpacePageByTypeSearchRequest extends AbstractRequest
        implements JdRequest {

    public KuaicheZnSpacePageByTypeSearchRequest() {
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public String getApiMethod() {
        return "jingdong.kuaiche.zn.space.page.by.type.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("type", type);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.kuaiche.KuaicheZnSpacePageByTypeSearchResponse.class;
    }

    private Integer type;
}
