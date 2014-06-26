// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsserviceJdInterveneResponse.java

package com.jd.open.api.sdk.response.service;

import com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade.JdInterveneResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfsserviceJdInterveneResponse extends AbstractResponse {

    public AfsserviceJdInterveneResponse() {
    }

    public void setJdInterveneResult(JdInterveneResult jdInterveneResult) {
        this.jdInterveneResult = jdInterveneResult;
    }

    public JdInterveneResult getJdInterveneResult() {
        return jdInterveneResult;
    }

    private JdInterveneResult jdInterveneResult;
}
