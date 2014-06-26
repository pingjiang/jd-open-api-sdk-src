// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnMaterialLabelsSearchResponse.java

package com.jd.open.api.sdk.response.kuaiche;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class KuaicheZnMaterialLabelsSearchResponse extends AbstractResponse {

    public KuaicheZnMaterialLabelsSearchResponse() {
    }

    public void setMaterialLabelList(List materialLabelList) {
        this.materialLabelList = materialLabelList;
    }

    public List getMaterialLabelList() {
        return materialLabelList;
    }

    private List materialLabelList;
}
