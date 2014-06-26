// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccMallMallbannercenterAddRequest.java

package com.jd.open.api.sdk.request.mall;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccMallMallbannercenterAddRequest extends AbstractRequest
        implements JdRequest {

    public EccMallMallbannercenterAddRequest() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public Long getMallId() {
        return mallId;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerLink(String bannerLink) {
        this.bannerLink = bannerLink;
    }

    public String getBannerLink() {
        return bannerLink;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public String getApiMethod() {
        return "jingdong.ecc.mall.mallbannercenter.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("id", id);
        pmap.put("mall_id", mallId);
        pmap.put("sort_number", sortNumber);
        pmap.put("banner_url", bannerUrl);
        pmap.put("banner_link", bannerLink);
        pmap.put("ip", ip);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.mall.EccMallMallbannercenterAddResponse.class;
    }

    private Long id;
    private Long mallId;
    private Integer sortNumber;
    private String bannerUrl;
    private String bannerLink;
    private String ip;
}
