// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccCategoryUpdateRequest.java

package com.jd.open.api.sdk.request.category;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccCategoryUpdateRequest extends AbstractRequest
        implements JdRequest {

    public EccCategoryUpdateRequest() {
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

    public void setCName(String cName) {
        this.cName = cName;
    }

    public String getCName() {
        return cName;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public Integer getLev() {
        return lev;
    }

    public void setHomeShow(Integer homeShow) {
        this.homeShow = homeShow;
    }

    public Integer getHomeShow() {
        return homeShow;
    }

    public String getApiMethod() {
        return "jingdong.ecc.category.update";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("parent_cid", parentCid);
        pmap.put("cid", cid);
        pmap.put("c_name", cName);
        pmap.put("sort_number", sortNumber);
        pmap.put("lev", lev);
        pmap.put("home_show", homeShow);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.category.EccCategoryUpdateResponse.class;
    }

    private Long parentCid;
    private Long cid;
    private String cName;
    private Integer sortNumber;
    private Integer lev;
    private Integer homeShow;
}
