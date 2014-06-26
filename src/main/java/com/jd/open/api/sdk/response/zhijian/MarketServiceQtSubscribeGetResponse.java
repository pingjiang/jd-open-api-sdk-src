// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MarketServiceQtSubscribeGetResponse.java

package com.jd.open.api.sdk.response.zhijian;

import com.jd.open.api.sdk.domain.zhijian.QTArticleService.QtArticleResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MarketServiceQtSubscribeGetResponse extends AbstractResponse {

    public MarketServiceQtSubscribeGetResponse() {
    }

    public void setQtArticleResult(QtArticleResult qtArticleResult) {
        this.qtArticleResult = qtArticleResult;
    }

    public QtArticleResult getQtArticleResult() {
        return qtArticleResult;
    }

    private QtArticleResult qtArticleResult;
}
