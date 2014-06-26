// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsMessageOut.java

package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade;

import java.io.Serializable;

public class AfsMessageOut
        implements Serializable {

    public AfsMessageOut() {
    }

    public void setAfsMessageId(Integer afsMessageId) {
        this.afsMessageId = afsMessageId;
    }

    public Integer getAfsMessageId() {
        return afsMessageId;
    }

    public void setAfsServiceId(Integer afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public Integer getAfsServiceId() {
        return afsServiceId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    private Integer afsMessageId;
    private Integer afsServiceId;
    private String title;
    private String context;
}
