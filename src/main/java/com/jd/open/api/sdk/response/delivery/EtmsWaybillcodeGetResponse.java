// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EtmsWaybillcodeGetResponse.java

package com.jd.open.api.sdk.response.delivery;

import com.jd.open.api.sdk.domain.delivery.OrderInfoJosService.GetResultInfoDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EtmsWaybillcodeGetResponse extends AbstractResponse {

    public EtmsWaybillcodeGetResponse() {
    }

    public void setResultInfo(GetResultInfoDTO resultInfo) {
        this.resultInfo = resultInfo;
    }

    public GetResultInfoDTO getResultInfo() {
        return resultInfo;
    }

    private GetResultInfoDTO resultInfo;
}
