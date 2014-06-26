// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionPropAddRequest.java

package com.jd.open.api.sdk.request.marketing;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionPropAddRequest extends AbstractRequest
        implements JdRequest {

    public SellerPromotionPropAddRequest() {
    }

    public void setPromoId(Long promoId) {
        this.promoId = promoId;
    }

    public Long getPromoId() {
        return promoId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setUsedWay(String usedWay) {
        this.usedWay = usedWay;
    }

    public String getUsedWay() {
        return usedWay;
    }

    public String getApiMethod() {
        return "jingdong.seller.promotion.prop.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("promo_id", promoId);
        pmap.put("type", type);
        pmap.put("num", num);
        pmap.put("used_way", usedWay);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.marketing.SellerPromotionPropAddResponse.class;
    }

    private Long promoId;
    private String type;
    private String num;
    private String usedWay;
}
