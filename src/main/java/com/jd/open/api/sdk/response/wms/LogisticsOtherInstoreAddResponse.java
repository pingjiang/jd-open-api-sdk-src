// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsOtherInstoreAddResponse.java

package com.jd.open.api.sdk.response.wms;

import com.jd.open.api.sdk.response.AbstractResponse;

public class LogisticsOtherInstoreAddResponse extends AbstractResponse {

    public LogisticsOtherInstoreAddResponse() {
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

    public void setResultNo(String resultNo) {
        this.resultNo = resultNo;
    }

    public String getResultNo() {
        return resultNo;
    }

    private long processCode;
    private String processStatus;
    private String errorMessage;
    private String resultNo;
}
