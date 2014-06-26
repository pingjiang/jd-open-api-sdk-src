// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareBasevideoGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareBasevideoGetResponse extends AbstractResponse {

    public WareBasevideoGetResponse() {
    }

    public void setVideoEntitys(List videoEntitys) {
        this.videoEntitys = videoEntitys;
    }

    public List getVideoEntitys() {
        return videoEntitys;
    }

    private List videoEntitys;
}
