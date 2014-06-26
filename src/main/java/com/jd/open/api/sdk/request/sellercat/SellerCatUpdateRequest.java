// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerCatUpdateRequest.java

package com.jd.open.api.sdk.request.sellercat;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerCatUpdateRequest extends AbstractRequest
        implements JdRequest {

    public SellerCatUpdateRequest() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHomeShow() {
        return isHomeShow;
    }

    public void setHomeShow(Boolean homeShow) {
        isHomeShow = homeShow;
    }

    public String getApiMethod() {
        return "360buy.sellercat.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("cid", cid);
        pmap.put("name", name);
        pmap.put("is_home_show", isHomeShow);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.sellercat.SellerCatUpdateResponse.class;
    }

    private String cid;
    private String name;
    private Boolean isHomeShow;
}
