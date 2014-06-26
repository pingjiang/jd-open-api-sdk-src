// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionActivitymodeAddRequest.java

package com.jd.open.api.sdk.request.marketing;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionActivitymodeAddRequest extends AbstractRequest
        implements JdRequest {

    public SellerPromotionActivitymodeAddRequest() {
    }

    public void setPromoId(Long promoId) {
        this.promoId = promoId;
    }

    public Long getPromoId() {
        return promoId;
    }

    public void setNumBound(Integer numBound) {
        this.numBound = numBound;
    }

    public Integer getNumBound() {
        return numBound;
    }

    public void setFreqBound(Integer freqBound) {
        this.freqBound = freqBound;
    }

    public Integer getFreqBound() {
        return freqBound;
    }

    public void setPerMaxNum(Integer perMaxNum) {
        this.perMaxNum = perMaxNum;
    }

    public Integer getPerMaxNum() {
        return perMaxNum;
    }

    public void setPerMinNum(Integer perMinNum) {
        this.perMinNum = perMinNum;
    }

    public Integer getPerMinNum() {
        return perMinNum;
    }

    public String getApiMethod() {
        return "jingdong.seller.promotion.activitymode.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("promo_id", promoId);
        pmap.put("num_bound", numBound);
        pmap.put("freq_bound", freqBound);
        pmap.put("per_max_num", perMaxNum);
        pmap.put("per_min_num", perMinNum);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.marketing.SellerPromotionActivitymodeAddResponse.class;
    }

    private Long promoId;
    private Integer numBound;
    private Integer freqBound;
    private Integer perMaxNum;
    private Integer perMinNum;
}
