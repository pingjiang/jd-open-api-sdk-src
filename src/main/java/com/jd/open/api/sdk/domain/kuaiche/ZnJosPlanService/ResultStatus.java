// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ResultStatus.java

package com.jd.open.api.sdk.domain.kuaiche.ZnJosPlanService;

import java.io.Serializable;

public class ResultStatus
        implements Serializable {

    public ResultStatus() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    private Integer resultCode;
    private String resultMessage;
}
