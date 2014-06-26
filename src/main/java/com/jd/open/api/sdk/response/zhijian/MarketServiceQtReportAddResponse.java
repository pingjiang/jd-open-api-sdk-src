// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MarketServiceQtReportAddResponse.java

package com.jd.open.api.sdk.response.zhijian;

import com.jd.open.api.sdk.domain.zhijian.QTReportService.AddResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MarketServiceQtReportAddResponse extends AbstractResponse {

    public MarketServiceQtReportAddResponse() {
    }

    public void setPublicResult(AddResult publicResult) {
        this.publicResult = publicResult;
    }

    public AddResult getPublicResult() {
        return publicResult;
    }

    private AddResult publicResult;
}
