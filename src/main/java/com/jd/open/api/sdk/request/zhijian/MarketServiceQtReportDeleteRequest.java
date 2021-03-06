// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MarketServiceQtReportDeleteRequest.java

package com.jd.open.api.sdk.request.zhijian;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketServiceQtReportDeleteRequest extends AbstractRequest
        implements JdRequest {

    public MarketServiceQtReportDeleteRequest() {
    }

    public void setQtCode(String qtCode) {
        this.qtCode = qtCode;
    }

    public String getQtCode() {
        return qtCode;
    }

    public String getApiMethod() {
        return "jingdong.market.service.qt.report.delete";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("qtCode", qtCode);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.zhijian.MarketServiceQtReportDeleteResponse.class;
    }

    private String qtCode;
}
