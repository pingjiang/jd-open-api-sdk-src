// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Promotion.java

package com.jd.open.api.sdk.response.promotion;

import java.util.ArrayList;
import java.util.List;

public class Promotion {

    public Promotion() {
        promotionProductList = new ArrayList();
    }

    public String getEvtStatus() {
        return evtStatus;
    }

    public void setEvtStatus(String evtStatus) {
        this.evtStatus = evtStatus;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getVenderId() {
        return venderId;
    }

    public void setVenderId(long venderId) {
        this.venderId = venderId;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevelMember() {
        return levelMember;
    }

    public void setLevelMember(String levelMember) {
        this.levelMember = levelMember;
    }

    public String getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(String timeBegin) {
        this.timeBegin = timeBegin;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getSynchStatus() {
        return synchStatus;
    }

    public void setSynchStatus(String synchStatus) {
        this.synchStatus = synchStatus;
    }

    public List getPromotionProductList() {
        return promotionProductList;
    }

    public void setPromotionProductList(List promotionProductList) {
        this.promotionProductList = promotionProductList;
    }

    private int id;
    private long venderId;
    private String promoName;
    private String type;
    private String levelMember;
    private String timeBegin;
    private String timeEnd;
    private String evtStatus;
    private String synchStatus;
    private String checkStatus;
    private List promotionProductList;
}
