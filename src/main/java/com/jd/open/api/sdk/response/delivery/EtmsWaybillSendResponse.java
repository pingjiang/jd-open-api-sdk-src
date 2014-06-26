// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EtmsWaybillSendResponse.java

package com.jd.open.api.sdk.response.delivery;

import com.jd.open.api.sdk.domain.delivery.OrderInfoJosService.SendResultInfoDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EtmsWaybillSendResponse extends AbstractResponse {

    public EtmsWaybillSendResponse() {
    }

    public void setResultInfo(SendResultInfoDTO resultInfo) {
        this.resultInfo = resultInfo;
    }

    public SendResultInfoDTO getResultInfo() {
        return resultInfo;
    }

    private SendResultInfoDTO resultInfo;
}
