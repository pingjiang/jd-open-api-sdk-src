// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SelectedKeywordInfo.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;
import java.math.BigDecimal;

public class SelectedKeywordInfo
        implements Serializable {

    public SelectedKeywordInfo() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWgroupId(String wgroupId) {
        this.wgroupId = wgroupId;
    }

    public String getWgroupId() {
        return wgroupId;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    private Long id;
    private Long planId;
    private String name;
    private String wgroupId;
    private BigDecimal price;
}
