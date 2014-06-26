// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WosWorkinfoGetResponse.java

package com.jd.open.api.sdk.response.workorder;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WosWorkinfoGetResponse extends AbstractResponse {

    public WosWorkinfoGetResponse() {
    }

    public void setResult(List result) {
        this.result = result;
    }

    public List getResult() {
        return result;
    }

    private List result;
}
