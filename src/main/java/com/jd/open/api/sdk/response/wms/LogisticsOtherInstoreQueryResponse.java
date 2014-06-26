// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsOtherInstoreQueryResponse.java

package com.jd.open.api.sdk.response.wms;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.Date;
import java.util.List;

public class LogisticsOtherInstoreQueryResponse extends AbstractResponse {

    public LogisticsOtherInstoreQueryResponse() {
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

    public void setInboundNo(String inboundNo) {
        this.inboundNo = inboundNo;
    }

    public String getInboundNo() {
        return inboundNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setInboundStatus(String inboundStatus) {
        this.inboundStatus = inboundStatus;
    }

    public String getInboundStatus() {
        return inboundStatus;
    }

    public void setStatusUpdateTime(Date statusUpdateTime) {
        this.statusUpdateTime = statusUpdateTime;
    }

    public Date getStatusUpdateTime() {
        return statusUpdateTime;
    }

    public void setTaskDetails(List taskDetails) {
        this.taskDetails = taskDetails;
    }

    public List getTaskDetails() {
        return taskDetails;
    }

    private long processCode;
    private String processStatus;
    private String errorMessage;
    private String inboundNo;
    private String poNo;
    private String inboundStatus;
    private Date statusUpdateTime;
    private List taskDetails;
}
