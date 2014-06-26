// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Image.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;

public class Image
        implements Serializable {

    public Image() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public Integer getYn() {
        return yn;
    }

    public void setIsPrimary(Integer isPrimary) {
        this.isPrimary = isPrimary;
    }

    public Integer getIsPrimary() {
        return isPrimary;
    }

    public void setOrderSort(Integer orderSort) {
        this.orderSort = orderSort;
    }

    public Integer getOrderSort() {
        return orderSort;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getPosition() {
        return position;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    private Integer id;
    private Integer skuId;
    private String path;
    private Integer yn;
    private Integer isPrimary;
    private Integer orderSort;
    private Integer position;
    private Integer type;
}
