// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerPromotionAddRequest.java

package com.jd.open.api.sdk.request.marketing;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionAddRequest extends AbstractRequest
        implements JdRequest {

    public SellerPromotionAddRequest() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setBound(Integer bound) {
        this.bound = bound;
    }

    public Integer getBound() {
        return bound;
    }

    public void setMember(Integer member) {
        this.member = member;
    }

    public Integer getMember() {
        return member;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public String getApiMethod() {
        return "jingdong.seller.promotion.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("name", name);
        pmap.put("type", type);
        pmap.put("begin_time", beginTime);
        pmap.put("end_time", endTime);
        pmap.put("bound", bound);
        pmap.put("member", member);
        pmap.put("slogan", slogan);
        pmap.put("comment", comment);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.marketing.SellerPromotionAddResponse.class;
    }

    private String name;
    private Integer type;
    private String beginTime;
    private String endTime;
    private Integer bound;
    private Integer member;
    private String slogan;
    private String comment;
}
