// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SnsExchangejpeasResponse.java

package com.jd.open.api.sdk.response.user;

import com.jd.open.api.sdk.domain.user.ExchangeJpeasFacade.JOSResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SnsExchangejpeasResponse extends AbstractResponse {

    public SnsExchangejpeasResponse() {
    }

    public void setExchangeResult(JOSResult exchangeResult) {
        this.exchangeResult = exchangeResult;
    }

    public JOSResult getExchangeResult() {
        return exchangeResult;
    }

    private JOSResult exchangeResult;
}
