// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsSkuUpdateResponse.java

package com.jd.open.api.sdk.response.wms;

import com.jd.open.api.sdk.response.AbstractResponse;

public class LogisticsSkuUpdateResponse extends AbstractResponse {

    public LogisticsSkuUpdateResponse() {
    }

    public void setProcessCode(long processCode) {
        this.processCode = processCode;
    }

    public long getProcessCode() {
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

    private long processCode;
    private String processStatus;
    private String errorMessage;
}
