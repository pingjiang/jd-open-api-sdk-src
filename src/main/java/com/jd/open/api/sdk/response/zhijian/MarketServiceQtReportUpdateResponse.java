// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MarketServiceQtReportUpdateResponse.java

package com.jd.open.api.sdk.response.zhijian;

import com.jd.open.api.sdk.domain.zhijian.QTReportService.UpdateResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MarketServiceQtReportUpdateResponse extends AbstractResponse {

    public MarketServiceQtReportUpdateResponse() {
    }

    public void setPublicResult(UpdateResult publicResult) {
        this.publicResult = publicResult;
    }

    public UpdateResult getPublicResult() {
        return publicResult;
    }

    private UpdateResult publicResult;
}
