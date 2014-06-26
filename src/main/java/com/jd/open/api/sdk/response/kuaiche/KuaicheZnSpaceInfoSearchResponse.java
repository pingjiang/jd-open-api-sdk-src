// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnSpaceInfoSearchResponse.java

package com.jd.open.api.sdk.response.kuaiche;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class KuaicheZnSpaceInfoSearchResponse extends AbstractResponse {

    public KuaicheZnSpaceInfoSearchResponse() {
    }

    public void setSpaceInfoList(List spaceInfoList) {
        this.spaceInfoList = spaceInfoList;
    }

    public List getSpaceInfoList() {
        return spaceInfoList;
    }

    private List spaceInfoList;
}
