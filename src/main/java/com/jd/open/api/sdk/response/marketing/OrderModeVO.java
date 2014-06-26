// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderModeVO.java

package com.jd.open.api.sdk.response.marketing;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderModeVO
        implements Serializable {

    public OrderModeVO() {
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

    public void setQuota(BigDecimal quota) {
        this.quota = quota;
    }

    public BigDecimal getQuota() {
        return quota;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setPlus(BigDecimal plus) {
        this.plus = plus;
    }

    public BigDecimal getPlus() {
        return plus;
    }

    public void setMinus(BigDecimal minus) {
        this.minus = minus;
    }

    public BigDecimal getMinus() {
        return minus;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    private Long promoId;
    private Integer favorMode;
    private BigDecimal quota;
    private BigDecimal rate;
    private BigDecimal plus;
    private BigDecimal minus;
    private String link;
}
