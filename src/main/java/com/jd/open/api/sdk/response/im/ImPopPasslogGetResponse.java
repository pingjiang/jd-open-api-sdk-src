// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImPopPasslogGetResponse.java

package com.jd.open.api.sdk.response.im;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class ImPopPasslogGetResponse extends AbstractResponse {

    public ImPopPasslogGetResponse() {
    }

    public void setPassLog(List PassLog) {
        this.PassLog = PassLog;
    }

    public List getPassLog() {
        return PassLog;
    }

    private List PassLog;
}
