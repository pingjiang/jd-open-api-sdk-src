// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnSpaceInfoSearchRequest.java

package com.jd.open.api.sdk.request.kuaiche;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class KuaicheZnSpaceInfoSearchRequest extends AbstractRequest
        implements JdRequest {

    public KuaicheZnSpaceInfoSearchRequest() {
    }

    public void setPageId(Long pageId) {
        this.pageId = pageId;
    }

    public Long getPageId() {
        return pageId;
    }

    public String getApiMethod() {
        return "jingdong.kuaiche.zn.space.info.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("page_id", pageId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.kuaiche.KuaicheZnSpaceInfoSearchResponse.class;
    }

    private Long pageId;
}
