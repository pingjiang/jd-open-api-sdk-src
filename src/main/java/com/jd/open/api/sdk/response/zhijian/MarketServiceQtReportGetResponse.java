// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MarketServiceQtReportGetResponse.java

package com.jd.open.api.sdk.response.zhijian;

import com.jd.open.api.sdk.domain.zhijian.QTReportService.GetResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MarketServiceQtReportGetResponse extends AbstractResponse {

    public MarketServiceQtReportGetResponse() {
    }

    public void setPublicResult(GetResult publicResult) {
        this.publicResult = publicResult;
    }

    public GetResult getPublicResult() {
        return publicResult;
    }

    private GetResult publicResult;
}
