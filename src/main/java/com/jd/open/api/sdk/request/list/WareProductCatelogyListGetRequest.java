// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareProductCatelogyListGetRequest.java

package com.jd.open.api.sdk.request.list;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareProductCatelogyListGetRequest extends AbstractRequest
        implements JdRequest {

    public WareProductCatelogyListGetRequest() {
    }

    public void setCatelogyId(Integer catelogyId) {
        this.catelogyId = catelogyId;
    }

    public Integer getCatelogyId() {
        return catelogyId;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getLevel() {
        return level;
    }

    public void setIsIcon(Boolean isIcon) {
        this.isIcon = isIcon;
    }

    public Boolean getIsIcon() {
        return isIcon;
    }

    public void setIsDescription(Boolean isDescription) {
        this.isDescription = isDescription;
    }

    public Boolean getIsDescription() {
        return isDescription;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getClient() {
        return client;
    }

    public String getApiMethod() {
        return "jingdong.ware.product.catelogy.list.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("catelogyId", catelogyId);
        pmap.put("level", level);
        pmap.put("isIcon", isIcon);
        pmap.put("isDescription", isDescription);
        pmap.put("client", client);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.list.WareProductCatelogyListGetResponse.class;
    }

    private Integer catelogyId;
    private Integer level;
    private Boolean isIcon;
    private Boolean isDescription;
    private String client;
}
