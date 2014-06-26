// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.domain.ware.Ware;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareGetResponse extends AbstractResponse {

    public WareGetResponse() {
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    private Ware ware;
}
