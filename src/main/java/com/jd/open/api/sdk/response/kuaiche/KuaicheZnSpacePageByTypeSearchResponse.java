// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnSpacePageByTypeSearchResponse.java

package com.jd.open.api.sdk.response.kuaiche;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class KuaicheZnSpacePageByTypeSearchResponse extends AbstractResponse {

    public KuaicheZnSpacePageByTypeSearchResponse() {
    }

    public void setSpacePageInfoList(List spacePageInfoList) {
        this.spacePageInfoList = spacePageInfoList;
    }

    public List getSpacePageInfoList() {
        return spacePageInfoList;
    }

    private List spacePageInfoList;
}
