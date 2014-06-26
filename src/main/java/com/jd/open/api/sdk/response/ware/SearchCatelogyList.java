// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SearchCatelogyList.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;
import java.util.List;

public class SearchCatelogyList
        implements Serializable {

    public SearchCatelogyList() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setWareCount(Integer wareCount) {
        this.wareCount = wareCount;
    }

    public Integer getWareCount() {
        return wareCount;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPage() {
        return page;
    }

    public void setRegionIsTrue(Boolean regionIsTrue) {
        this.regionIsTrue = regionIsTrue;
    }

    public Boolean getRegionIsTrue() {
        return regionIsTrue;
    }

    public void setSelfIsTrue(Boolean selfIsTrue) {
        this.selfIsTrue = selfIsTrue;
    }

    public Boolean getSelfIsTrue() {
        return selfIsTrue;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getShow() {
        return show;
    }

    public void setWareInfo(List wareInfo) {
        this.wareInfo = wareInfo;
    }

    public List getWareInfo() {
        return wareInfo;
    }

    private Integer resultCode;
    private Integer wareCount;
    private Integer page;
    private Boolean regionIsTrue;
    private Boolean selfIsTrue;
    private String show;
    private List wareInfo;
}
