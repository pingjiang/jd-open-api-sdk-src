// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VcGetReturnOrderDetailRequest.java

package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcGetReturnOrderDetailRequest extends AbstractRequest
        implements JdRequest {

    public VcGetReturnOrderDetailRequest() {
    }

    public void setReturnId(Long returnId) {
        this.returnId = returnId;
    }

    public Long getReturnId() {
        return returnId;
    }

    public String getApiMethod() {
        return "jingdong.vc.get.return.order.detail";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("returnId", returnId);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.supplier.VcGetReturnOrderDetailResponse.class;
    }

    private Long returnId;
}
