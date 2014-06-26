// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SkuAddResponse.java

package com.jd.open.api.sdk.domain.O2O.StoreOFCService;

import java.io.Serializable;

public class SkuAddResponse
        implements Serializable {

    public SkuAddResponse() {
    }

    public void setProcessCode(Integer processCode) {
        this.processCode = processCode;
    }

    public Integer getProcessCode() {
        return processCode;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    private Integer processCode;
    private String processStatus;
    private String errorMessage;
}
