// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CombineBuyingWidsList.java

package com.jd.open.api.sdk.response.recommend;

import java.io.Serializable;
import java.util.List;

public class CombineBuyingWidsList
        implements Serializable {

    public CombineBuyingWidsList() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setCombineWareId(String combineWareId) {
        this.combineWareId = combineWareId;
    }

    public String getCombineWareId() {
        return combineWareId;
    }

    public void setShowClick(String showClick) {
        this.showClick = showClick;
    }

    public String getShowClick() {
        return showClick;
    }

    public void setCombineBuyingWids(List combineBuyingWids) {
        this.combineBuyingWids = combineBuyingWids;
    }

    public List getCombineBuyingWids() {
        return combineBuyingWids;
    }

    private Integer resultCode;
    private String combineWareId;
    private String showClick;
    private List combineBuyingWids;
}
