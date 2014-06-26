// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccMallMallinfocenterGetRequest.java

package com.jd.open.api.sdk.request.mall;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccMallMallinfocenterGetRequest extends AbstractRequest
        implements JdRequest {

    public EccMallMallinfocenterGetRequest() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return logo;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public String getApiMethod() {
        return "jingdong.ecc.mall.mallinfocenter.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("id", id);
        pmap.put("title", title);
        pmap.put("logo", logo);
        pmap.put("ip", ip);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.mall.EccMallMallinfocenterGetResponse.class;
    }

    private Long id;
    private String title;
    private String logo;
    private String ip;
}
