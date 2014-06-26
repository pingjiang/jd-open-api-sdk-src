// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsReturnorderCancelRequest.java

package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsReturnorderCancelRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsReturnorderCancelRequest() {
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public String getApiMethod() {
        return "jingdong.logistics.returnorder.cancel";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("receipt_no", receiptNo);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.wms.LogisticsReturnorderCancelResponse.class;
    }

    private String receiptNo;
}
