// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MarketServiceQtReportListGetResponse.java

package com.jd.open.api.sdk.response.zhijian;

import com.jd.open.api.sdk.domain.zhijian.QTReportService.ReportsResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MarketServiceQtReportListGetResponse extends AbstractResponse {

    public MarketServiceQtReportListGetResponse() {
    }

    public void setPublicResult(ReportsResult publicResult) {
        this.publicResult = publicResult;
    }

    public ReportsResult getPublicResult() {
        return publicResult;
    }

    private ReportsResult publicResult;
}
