// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnPlanSearchKeywordGetResponse.java

package com.jd.open.api.sdk.response.kuaiche;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class KuaicheZnPlanSearchKeywordGetResponse extends AbstractResponse {

    public KuaicheZnPlanSearchKeywordGetResponse() {
    }

    public void setKeywordsInfo(List keywordsInfo) {
        this.keywordsInfo = keywordsInfo;
    }

    public List getKeywordsInfo() {
        return keywordsInfo;
    }

    private List keywordsInfo;
}
