// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionOrdermodeAddRequest.java

package com.jd.open.api.sdk.request.marketing;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionOrdermodeAddRequest extends AbstractRequest
        implements JdRequest {

    public SellerPromotionOrdermodeAddRequest() {
    }

    public void setPromoId(Long promoId) {
        this.promoId = promoId;
    }

    public Long getPromoId() {
        return promoId;
    }

    public void setFavorMode(Integer favorMode) {
        this.favorMode = favorMode;
    }

    public Integer getFavorMode() {
        return favorMode;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getQuota() {
        return quota;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }

    public String getPlus() {
        return plus;
    }

    public void setMinus(String minus) {
        this.minus = minus;
    }

    public String getMinus() {
        return minus;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public String getApiMethod() {
        return "jingdong.seller.promotion.ordermode.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("promo_id", promoId);
        pmap.put("favor_mode", favorMode);
        pmap.put("quota", quota);
        pmap.put("rate", rate);
        pmap.put("plus", plus);
        pmap.put("minus", minus);
        pmap.put("link", link);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.marketing.SellerPromotionOrdermodeAddResponse.class;
    }

    private Long promoId;
    private Integer favorMode;
    private String quota;
    private String rate;
    private String plus;
    private String minus;
    private String link;
}
