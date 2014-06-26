// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionSkuListRequest.java

package com.jd.open.api.sdk.request.marketing;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionSkuListRequest extends AbstractRequest
        implements JdRequest {

    public SellerPromotionSkuListRequest() {
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setPromoId(Long promoId) {
        this.promoId = promoId;
    }

    public Long getPromoId() {
        return promoId;
    }

    public void setBindType(Integer bindType) {
        this.bindType = bindType;
    }

    public Integer getBindType() {
        return bindType;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getApiMethod() {
        return "jingdong.seller.promotion.sku.list";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("ware_id", wareId);
        pmap.put("sku_id", skuId);
        pmap.put("promo_id", promoId);
        pmap.put("bind_type", bindType);
        pmap.put("page", Integer.valueOf(page));
        pmap.put("size", Integer.valueOf(size));
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.marketing.SellerPromotionSkuListResponse.class;
    }

    private Long wareId;
    private Long skuId;
    private Long promoId;
    private Integer bindType;
    private int page;
    private int size;
}
