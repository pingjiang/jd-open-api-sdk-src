// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KeywordGroup.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;

public class KeywordGroup
        implements Serializable {

    public KeywordGroup() {
    }

    public void setWgroupId(Long wgroupId) {
        this.wgroupId = wgroupId;
    }

    public Long getWgroupId() {
        return wgroupId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSearchNum(Long searchNum) {
        this.searchNum = searchNum;
    }

    public Long getSearchNum() {
        return searchNum;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public Double getAvgPrice() {
        return avgPrice;
    }

    public void setWeekCtr(Double weekCtr) {
        this.weekCtr = weekCtr;
    }

    public Double getWeekCtr() {
        return weekCtr;
    }

    private Long wgroupId;
    private String name;
    private Long searchNum;
    private Double basePrice;
    private Double avgPrice;
    private Double weekCtr;
}
