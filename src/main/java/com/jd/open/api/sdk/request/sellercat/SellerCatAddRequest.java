// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerCatAddRequest.java

package com.jd.open.api.sdk.request.sellercat;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerCatAddRequest extends AbstractRequest
        implements JdRequest {

    public SellerCatAddRequest() {
    }

    public String getApiMethod() {
        return "360buy.sellercat.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new TreeMap();
        map.put("parent_id", parentId);
        map.put("name", name);
        map.put("is_open", isOpen);
        map.put("is_home_show", isHomeShow);
        return JsonUtil.toJson(map);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.sellercat.SellerCatAddResponse.class;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    public Boolean getHomeShow() {
        return isHomeShow;
    }

    public void setHomeShow(Boolean homeShow) {
        isHomeShow = homeShow;
    }

    private String parentId;
    private String name;
    private Boolean isOpen;
    private Boolean isHomeShow;
}
