// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsSkuQueryRequest.java

package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsSkuQueryRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsSkuQueryRequest() {
    }

    public void setJoslGoodNo(String joslGoodNo) {
        this.joslGoodNo = joslGoodNo;
    }

    public String getJoslGoodNo() {
        return joslGoodNo;
    }

    public void setIsvGoodNo(String isvGoodNo) {
        this.isvGoodNo = isvGoodNo;
    }

    public String getIsvGoodNo() {
        return isvGoodNo;
    }

    public String getApiMethod() {
        return "jingdong.logistics.sku.query";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("josl_good_no", joslGoodNo);
        pmap.put("isv_good_no", isvGoodNo);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.wms.LogisticsSkuQueryResponse.class;
    }

    private String joslGoodNo;
    private String isvGoodNo;
}
