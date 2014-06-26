// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareProductDetailSearchListGetRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareProductDetailSearchListGetRequest extends AbstractRequest
        implements JdRequest {

    public WareProductDetailSearchListGetRequest() {
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setIsLoadWareScore(Boolean isLoadWareScore) {
        this.isLoadWareScore = isLoadWareScore;
    }

    public Boolean getIsLoadWareScore() {
        return isLoadWareScore;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getClient() {
        return client;
    }

    public String getApiMethod() {
        return "jingdong.ware.product.detail.search.list.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("skuId", skuId);
        pmap.put("isLoadWareScore", isLoadWareScore);
        pmap.put("client", client);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WareProductDetailSearchListGetResponse.class;
    }

    private Long skuId;
    private Boolean isLoadWareScore;
    private String client;
}
