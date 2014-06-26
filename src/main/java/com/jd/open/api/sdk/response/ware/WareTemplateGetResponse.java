// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareTemplateGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.domain.ware.WareTemplate;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareTemplateGetResponse extends AbstractResponse {

    public WareTemplateGetResponse() {
    }

    public WareTemplate getWareTemplate() {
        return wareTemplate;
    }

    public void setWareTemplate(WareTemplate wareTemplate) {
        this.wareTemplate = wareTemplate;
    }

    private WareTemplate wareTemplate;
}
