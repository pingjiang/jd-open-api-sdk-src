// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareTemplateIdsAndNamesGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareTemplateIdsAndNamesGetResponse extends AbstractResponse {

    public WareTemplateIdsAndNamesGetResponse() {
    }

    public List getWareTemplateList() {
        return wareTemplateList;
    }

    public void setWareTemplateList(List wareTemplateList) {
        this.wareTemplateList = wareTemplateList;
    }

    private List wareTemplateList;
}
