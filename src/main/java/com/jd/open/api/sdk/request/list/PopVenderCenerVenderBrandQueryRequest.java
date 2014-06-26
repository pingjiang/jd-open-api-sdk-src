// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PopVenderCenerVenderBrandQueryRequest.java

package com.jd.open.api.sdk.request.list;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopVenderCenerVenderBrandQueryRequest extends AbstractRequest
        implements JdRequest {

    public PopVenderCenerVenderBrandQueryRequest() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getApiMethod() {
        return "jingdong.pop.vender.cener.venderBrand.query";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("name", name);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.list.PopVenderCenerVenderBrandQueryResponse.class;
    }

    private String name;
}
