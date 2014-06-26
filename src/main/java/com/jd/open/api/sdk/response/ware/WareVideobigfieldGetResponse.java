// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareVideobigfieldGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareVideobigfieldGetResponse extends AbstractResponse {

    public WareVideobigfieldGetResponse() {
    }

    public void setVideoBigFieldEntity(List VideoBigFieldEntity) {
        this.VideoBigFieldEntity = VideoBigFieldEntity;
    }

    public List getVideoBigFieldEntity() {
        return VideoBigFieldEntity;
    }

    private List VideoBigFieldEntity;
}
