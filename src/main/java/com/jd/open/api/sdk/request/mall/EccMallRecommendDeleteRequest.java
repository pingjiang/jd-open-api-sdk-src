// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccMallRecommendDeleteRequest.java

package com.jd.open.api.sdk.request.mall;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccMallRecommendDeleteRequest extends AbstractRequest
        implements JdRequest {

    public EccMallRecommendDeleteRequest() {
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

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getPosition() {
        return position;
    }

    public void setRecType(Integer recType) {
        this.recType = recType;
    }

    public Integer getRecType() {
        return recType;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public Long getMallId() {
        return mallId;
    }

    public void setRecommendWareListJson(String recommendWareListJson) {
        this.recommendWareListJson = recommendWareListJson;
    }

    public String getRecommendWareListJson() {
        return recommendWareListJson;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public String getApiMethod() {
        return "jingdong.ecc.mall.recommend.delete";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("id", id);
        pmap.put("title", title);
        pmap.put("position", position);
        pmap.put("rec_type", recType);
        pmap.put("mall_id", mallId);
        pmap.put("recommend_ware_list_json", recommendWareListJson);
        pmap.put("ip", ip);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.mall.EccMallRecommendDeleteResponse.class;
    }

    private Long id;
    private String title;
    private Integer position;
    private Integer recType;
    private Long mallId;
    private String recommendWareListJson;
    private String ip;
}
