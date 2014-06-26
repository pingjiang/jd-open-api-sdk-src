// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RegionInfoGetResponse.java

package com.jd.open.api.sdk.response.website.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class RegionInfoGetResponse extends AbstractResponse {

    public RegionInfoGetResponse() {
    }

    public List getRegions() {
        return regions;
    }

    public void setRegions(List regions) {
        this.regions = regions;
    }

    private List regions;
}
