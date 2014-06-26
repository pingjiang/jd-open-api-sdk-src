// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Region.java

package com.jd.open.api.sdk.domain.website.ware;


public class Region {

    public Region() {
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getResionName() {
        return resionName;
    }

    public void setResionName(String resionName) {
        this.resionName = resionName;
    }

    private Long regionId;
    private String resionName;
}
