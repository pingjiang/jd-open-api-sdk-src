// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SnsExchangestatusGetResponse.java

package com.jd.open.api.sdk.response.user;

import com.jd.open.api.sdk.domain.user.ExchangeJpeasFacade.JOSResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SnsExchangestatusGetResponse extends AbstractResponse {

    public SnsExchangestatusGetResponse() {
    }

    public void setQueryexchangestatusResult(JOSResult queryexchangestatusResult) {
        this.queryexchangestatusResult = queryexchangestatusResult;
    }

    public JOSResult getQueryexchangestatusResult() {
        return queryexchangestatusResult;
    }

    private JOSResult queryexchangestatusResult;
}
