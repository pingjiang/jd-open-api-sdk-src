// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ActivityModeVO.java

package com.jd.open.api.sdk.response.marketing;

import java.io.Serializable;

public class ActivityModeVO
        implements Serializable {

    public ActivityModeVO() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

    private Long id;
    private Long promoId;
    private Integer numBound;
    private Integer freqBound;
    private Integer perMaxNum;
    private Integer perMinNum;
}
