// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EtmsTraceGetResponse.java

package com.jd.open.api.sdk.response.delivery;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class EtmsTraceGetResponse extends AbstractResponse {

    public EtmsTraceGetResponse() {
    }

    public void setTraceApiDtos(List traceApiDtos) {
        this.traceApiDtos = traceApiDtos;
    }

    public List getTraceApiDtos() {
        return traceApiDtos;
    }

    private List traceApiDtos;
}
