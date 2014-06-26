// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccCategoryGetRequest.java

package com.jd.open.api.sdk.request.category;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccCategoryGetRequest extends AbstractRequest
        implements JdRequest {

    public EccCategoryGetRequest() {
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return cid;
    }

    public String getApiMethod() {
        return "jingdong.ecc.category.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("cid", cid);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.category.EccCategoryGetResponse.class;
    }

    private Long cid;
}
