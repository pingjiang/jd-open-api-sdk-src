// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MarketServiceQtReportDeleteResponse.java

package com.jd.open.api.sdk.response.zhijian;

import com.jd.open.api.sdk.domain.zhijian.QTReportService.ReportDeleteResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MarketServiceQtReportDeleteResponse extends AbstractResponse {

    public MarketServiceQtReportDeleteResponse() {
    }

    public void setPublicResult(ReportDeleteResult publicResult) {
        this.publicResult = publicResult;
    }

    public ReportDeleteResult getPublicResult() {
        return publicResult;
    }

    private ReportDeleteResult publicResult;
}
