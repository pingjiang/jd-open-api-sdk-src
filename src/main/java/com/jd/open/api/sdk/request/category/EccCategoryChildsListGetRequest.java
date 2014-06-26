// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccCategoryChildsListGetRequest.java

package com.jd.open.api.sdk.request.category;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccCategoryChildsListGetRequest extends AbstractRequest
        implements JdRequest {

    public EccCategoryChildsListGetRequest() {
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getPid() {
        return pid;
    }

    public String getApiMethod() {
        return "jingdong.ecc.category.childs.list.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("pid", pid);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.category.EccCategoryChildsListGetResponse.class;
    }

    private Long pid;
}
