// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareCategory.java

package com.jd.open.api.sdk.domain.website.category;


public class WareCategory {

    public WareCategory() {
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public Long getChildLevel() {
        return childLevel;
    }

    public void setChildLevel(Long childLevel) {
        this.childLevel = childLevel;
    }

    private Long cid;
    private Long fid;
    private Long level;
    private String name;
    private Long index;
    private Long childLevel;
}
