// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ResponseReturnOrder.java

package com.jd.open.api.sdk.response.wms;

import java.io.Serializable;

public class ResponseReturnOrder
        implements Serializable {

    public ResponseReturnOrder() {
    }

    public void setProcessCode(int processCode) {
        this.processCode = processCode;
    }

    public int getProcessCode() {
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

    public void setJoslInboundNo(String joslInboundNo) {
        this.joslInboundNo = joslInboundNo;
    }

    public String getJoslInboundNo() {
        return joslInboundNo;
    }

    public void setReturnOrderNo(String returnOrderNo) {
        this.returnOrderNo = returnOrderNo;
    }

    public String getReturnOrderNo() {
        return returnOrderNo;
    }

    public void setJoslOutboundNo(String joslOutboundNo) {
        this.joslOutboundNo = joslOutboundNo;
    }

    public String getJoslOutboundNo() {
        return joslOutboundNo;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    private int processCode;
    private String processStatus;
    private String errorMessage;
    private String joslInboundNo;
    private String returnOrderNo;
    private String joslOutboundNo;
    private int status;
    private String completeTime;
}
