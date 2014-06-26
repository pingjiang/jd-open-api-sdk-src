// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccUserSearchRequest.java

package com.jd.open.api.sdk.request.user;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccUserSearchRequest extends AbstractRequest
        implements JdRequest {

    public EccUserSearchRequest() {
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public String getApiMethod() {
        return "jingdong.ecc.user.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("ip", ip);
        pmap.put("page_size", Integer.valueOf(pageSize));
        pmap.put("page_index", Integer.valueOf(pageIndex));
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.user.EccUserSearchResponse.class;
    }

    private String ip;
    private int pageSize;
    private int pageIndex;
}
