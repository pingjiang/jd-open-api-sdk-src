// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerVenderInfoGetRequest.java

package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerVenderInfoGetRequest extends AbstractRequest
        implements JdRequest {

    public SellerVenderInfoGetRequest() {
    }

    public void setExtJsonParam(String extJsonParam) {
        this.extJsonParam = extJsonParam;
    }

    public String getExtJsonParam() {
        return extJsonParam;
    }

    public String getApiMethod() {
        return "jingdong.seller.vender.info.get";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("ext_json_param", extJsonParam);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.seller.SellerVenderInfoGetResponse.class;
    }

    private String extJsonParam;
}
