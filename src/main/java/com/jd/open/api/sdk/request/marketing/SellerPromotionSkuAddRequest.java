// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionSkuAddRequest.java

package com.jd.open.api.sdk.request.marketing;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionSkuAddRequest extends AbstractRequest
        implements JdRequest {

    public SellerPromotionSkuAddRequest() {
    }

    public void setPromoId(Long promoId) {
        this.promoId = promoId;
    }

    public Long getPromoId() {
        return promoId;
    }

    public void setSkuIds(String skuIds) {
        this.skuIds = skuIds;
    }

    public String getSkuIds() {
        return skuIds;
    }

    public void setJdPrices(String jdPrices) {
        this.jdPrices = jdPrices;
    }

    public String getJdPrices() {
        return jdPrices;
    }

    public void setPromoPrices(String promoPrices) {
        this.promoPrices = promoPrices;
    }

    public String getPromoPrices() {
        return promoPrices;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getSeq() {
        return seq;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setBindType(String bindType) {
        this.bindType = bindType;
    }

    public String getBindType() {
        return bindType;
    }

    public String getApiMethod() {
        return "jingdong.seller.promotion.sku.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("promo_id", promoId);
        pmap.put("sku_ids", skuIds);
        pmap.put("jd_prices", jdPrices);
        pmap.put("promo_prices", promoPrices);
        pmap.put("seq", seq);
        pmap.put("num", num);
        pmap.put("bind_type", bindType);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.marketing.SellerPromotionSkuAddResponse.class;
    }

    private Long promoId;
    private String skuIds;
    private String jdPrices;
    private String promoPrices;
    private String seq;
    private String num;
    private String bindType;
}
