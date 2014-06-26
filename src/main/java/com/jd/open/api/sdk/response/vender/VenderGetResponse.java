// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VenderGetResponse.java

package com.jd.open.api.sdk.response.vender;

import com.jd.open.api.sdk.domain.vender.Vender;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderGetResponse extends AbstractResponse {

    public VenderGetResponse() {
    }

    public Vender getVender() {
        return vender;
    }

    public void setVender(Vender vender) {
        this.vender = vender;
    }

    private Vender vender;
}
