// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JosGoodsInfo.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;
import java.util.List;

public class JosGoodsInfo
        implements Serializable {

    public JosGoodsInfo() {
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setWpName(String wpName) {
        this.wpName = wpName;
    }

    public String getWpName() {
        return wpName;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setWName(String wName) {
        this.wName = wName;
    }

    public String getWName() {
        return wName;
    }

    public void setWpId(long wpId) {
        this.wpId = wpId;
    }

    public long getWpId() {
        return wpId;
    }

    public void setClassNames(List classNames) {
        this.classNames = classNames;
    }

    public List getClassNames() {
        return classNames;
    }

    public void setClassIds(List classIds) {
        this.classIds = classIds;
    }

    public List getClassIds() {
        return classIds;
    }

    public void setImageUrls(List imageUrls) {
        this.imageUrls = imageUrls;
    }

    public List getImageUrls() {
        return imageUrls;
    }

    public void setSkuSimilars(List skuSimilars) {
        this.skuSimilars = skuSimilars;
    }

    public List getSkuSimilars() {
        return skuSimilars;
    }

    private int code;
    private String wpName;
    private String imageUrl;
    private String wName;
    private long wpId;
    private List classNames;
    private List classIds;
    private List imageUrls;
    private List skuSimilars;
}
