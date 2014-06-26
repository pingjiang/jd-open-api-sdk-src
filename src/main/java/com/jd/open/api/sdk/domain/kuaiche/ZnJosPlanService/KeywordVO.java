// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KeywordVO.java

package com.jd.open.api.sdk.domain.kuaiche.ZnJosPlanService;

import java.io.Serializable;
import java.math.BigDecimal;

public class KeywordVO
        implements Serializable {

    public KeywordVO() {
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Long getPlanId() {
        return planId;
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

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    private Long planId;
    private Long wgroupId;
    private String name;
    private BigDecimal price;
}
