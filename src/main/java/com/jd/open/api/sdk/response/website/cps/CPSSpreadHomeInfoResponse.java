// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CPSSpreadHomeInfoResponse.java

package com.jd.open.api.sdk.response.website.cps;

import com.jd.open.api.sdk.domain.website.cps.CPSSpreadHomeInfoModule;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CPSSpreadHomeInfoResponse extends AbstractResponse {

    public CPSSpreadHomeInfoResponse() {
    }

    public CPSSpreadHomeInfoModule getHomeInfoModule() {
        return homeInfoModule;
    }

    public void setHomeInfoModule(CPSSpreadHomeInfoModule homeInfoModule) {
        this.homeInfoModule = homeInfoModule;
    }

    private CPSSpreadHomeInfoModule homeInfoModule;
}
