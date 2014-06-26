// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccCategoryListGetRequest.java

package com.jd.open.api.sdk.request.category;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccCategoryListGetRequest extends AbstractRequest
        implements JdRequest {

    public EccCategoryListGetRequest() {
    }

    public void setParentCid(Long parentCid) {
        this.parentCid = parentCid;
    }

    public Long getParentCid() {
        return parentCid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return cid;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public Integer getLev() {
        return lev;
    }

    public String getApiMethod() {
        return "jingdong.ecc.category.list.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("parent_cid", parentCid);
        pmap.put("cid", cid);
        pmap.put("status", status);
        pmap.put("lev", lev);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.category.EccCategoryListGetResponse.class;
    }

    private Long parentCid;
    private Long cid;
    private Integer status;
    private Integer lev;
}
