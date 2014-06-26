// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareProductSearchListGetRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareProductSearchListGetRequest extends AbstractRequest
        implements JdRequest {

    public WareProductSearchListGetRequest() {
    }

    public void setIsLoadAverageScore(Boolean isLoadAverageScore) {
        this.isLoadAverageScore = isLoadAverageScore;
    }

    public Boolean getIsLoadAverageScore() {
        return isLoadAverageScore;
    }

    public void setIsLoadPromotion(Boolean isLoadPromotion) {
        this.isLoadPromotion = isLoadPromotion;
    }

    public Boolean getIsLoadPromotion() {
        return isLoadPromotion;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSort() {
        return sort;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPage() {
        return page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getClient() {
        return client;
    }

    public String getApiMethod() {
        return "jingdong.ware.product.search.list.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("isLoadAverageScore", isLoadAverageScore);
        pmap.put("isLoadPromotion", isLoadPromotion);
        pmap.put("sort", sort);
        pmap.put("page", page);
        pmap.put("pageSize", pageSize);
        pmap.put("keyword", keyword);
        pmap.put("client", client);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WareProductSearchListGetResponse.class;
    }

    private Boolean isLoadAverageScore;
    private Boolean isLoadPromotion;
    private Integer sort;
    private Integer page;
    private Integer pageSize;
    private String keyword;
    private String client;
}
