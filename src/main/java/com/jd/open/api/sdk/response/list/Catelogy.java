// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Catelogy.java

package com.jd.open.api.sdk.response.list;

import java.io.Serializable;

public class Catelogy
        implements Serializable {

    public Catelogy() {
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void setOrderSort(Integer orderSort) {
        this.orderSort = orderSort;
    }

    public Integer getOrderSort() {
        return orderSort;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getLevel() {
        return level;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCid() {
        return cid;
    }

    private Integer fid;
    private String icon;
    private Integer orderSort;
    private Integer level;
    private String description;
    private String name;
    private Integer cid;
}
