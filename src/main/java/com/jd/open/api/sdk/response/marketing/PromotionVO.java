// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PromotionVO.java

package com.jd.open.api.sdk.response.marketing;

import java.io.Serializable;

public class PromotionVO
        implements Serializable {

    public PromotionVO() {
    }

    public void setPromoId(Long promoId) {
        this.promoId = promoId;
    }

    public Long getPromoId() {
        return promoId;
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

    public void setBound(Integer bound) {
        this.bound = bound;
    }

    public Integer getBound() {
        return bound;
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

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    private Long promoId;
    private String name;
    private Integer type;
    private Integer bound;
    private String beginTime;
    private String endTime;
    private Integer member;
    private String slogan;
    private String comment;
    private Integer status;
}
