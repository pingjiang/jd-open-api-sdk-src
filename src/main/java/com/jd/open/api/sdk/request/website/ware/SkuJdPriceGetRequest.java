// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SkuJdPriceGetRequest.java

package com.jd.open.api.sdk.request.website.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.website.ware.SkuJdPriceGetResponse;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SkuJdPriceGetRequest extends AbstractRequest
        implements JdRequest {

    public SkuJdPriceGetRequest() {
    }

    public String getApiMethod() {
        return "jingdong.sku.jdprice.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("sku_id", skuId);
        pmap.put("website", webSite);
        pmap.put("origin", origin);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return SkuJdPriceGetResponse.class;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Integer getWebSite() {
        return webSite;
    }

    public void setWebSite(Integer webSite) {
        this.webSite = webSite;
    }

    public Integer getOrigin() {
        return origin;
    }

    public void setOrigin(Integer origin) {
        this.origin = origin;
    }

    private String skuId;
    private Integer webSite;
    private Integer origin;
}
