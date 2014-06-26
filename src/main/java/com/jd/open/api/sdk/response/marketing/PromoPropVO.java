// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PromoPropVO.java

package com.jd.open.api.sdk.response.marketing;

import java.io.Serializable;

public class PromoPropVO
        implements Serializable {

    public PromoPropVO() {
    }

    public void setPromoId(Long promoId) {
        this.promoId = promoId;
    }

    public Long getPromoId() {
        return promoId;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setUsedWay(Integer usedWay) {
        this.usedWay = usedWay;
    }

    public Integer getUsedWay() {
        return usedWay;
    }

    private Long promoId;
    private Integer type;
    private Integer num;
    private Integer usedWay;
}
