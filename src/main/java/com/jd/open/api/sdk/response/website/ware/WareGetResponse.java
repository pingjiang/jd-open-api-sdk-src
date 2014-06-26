// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareGetResponse.java

package com.jd.open.api.sdk.response.website.ware;

import com.jd.open.api.sdk.domain.website.ware.Ware;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareGetResponse extends AbstractResponse {

    public WareGetResponse() {
    }

    public Ware getWareModel() {
        return wareModel;
    }

    public void setWareModel(Ware wareModel) {
        this.wareModel = wareModel;
    }

    private Ware wareModel;
}
