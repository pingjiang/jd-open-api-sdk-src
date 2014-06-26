// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EtmsWaybillcodeGetRequest.java

package com.jd.open.api.sdk.request.delivery;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EtmsWaybillcodeGetRequest extends AbstractRequest
        implements JdRequest {

    public EtmsWaybillcodeGetRequest() {
    }

    public void setPreNum(String preNum) {
        this.preNum = preNum;
    }

    public String getPreNum() {
        return preNum;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public String getApiMethod() {
        return "jingdong.etms.waybillcode.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("preNum", preNum);
        pmap.put("customerCode", customerCode);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.delivery.EtmsWaybillcodeGetResponse.class;
    }

    private String preNum;
    private String customerCode;
}
