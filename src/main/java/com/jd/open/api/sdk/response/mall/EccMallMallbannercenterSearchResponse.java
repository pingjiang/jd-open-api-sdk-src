// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccMallMallbannercenterSearchResponse.java

package com.jd.open.api.sdk.response.mall;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class EccMallMallbannercenterSearchResponse extends AbstractResponse {

    public EccMallMallbannercenterSearchResponse() {
    }

    public void setMallBannerResults(List mallBannerResults) {
        this.mallBannerResults = mallBannerResults;
    }

    public List getMallBannerResults() {
        return mallBannerResults;
    }

    private List mallBannerResults;
}
