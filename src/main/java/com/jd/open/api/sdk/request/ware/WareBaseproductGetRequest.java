// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareBaseproductGetRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareBaseproductGetRequest extends AbstractRequest
        implements JdRequest {

    public WareBaseproductGetRequest() {
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getIds() {
        return ids;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getBase() {
        return base;
    }

    public String getApiMethod() {
        return "jingdong.ware.baseproduct.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("ids", ids);
        pmap.put("base", base);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WareBaseproductGetResponse.class;
    }

    private String ids;
    private String base;
}
