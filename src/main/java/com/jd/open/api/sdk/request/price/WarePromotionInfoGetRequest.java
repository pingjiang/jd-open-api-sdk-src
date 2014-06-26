// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WarePromotionInfoGetRequest.java

package com.jd.open.api.sdk.request.price;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WarePromotionInfoGetRequest extends AbstractRequest
        implements JdRequest {

    public WarePromotionInfoGetRequest() {
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setWebSite(int webSite) {
        this.webSite = webSite;
    }

    public int getWebSite() {
        return webSite;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public int getOrigin() {
        return origin;
    }

    public String getApiMethod() {
        return "jingdong.ware.promotionInfo.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("skuId", skuId);
        pmap.put("webSite", Integer.valueOf(webSite));
        pmap.put("origin", Integer.valueOf(origin));
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.price.WarePromotionInfoGetResponse.class;
    }

    private String skuId;
    private int webSite;
    private int origin;
}
