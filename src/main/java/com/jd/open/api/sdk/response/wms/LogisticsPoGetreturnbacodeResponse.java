// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsPoGetreturnbacodeResponse.java

package com.jd.open.api.sdk.response.wms;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class LogisticsPoGetreturnbacodeResponse extends AbstractResponse {

    public LogisticsPoGetreturnbacodeResponse() {
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

    public void setReceivingStatus(String receivingStatus) {
        this.receivingStatus = receivingStatus;
    }

    public String getReceivingStatus() {
        return receivingStatus;
    }

    public void setTaskDetails(List taskDetails) {
        this.taskDetails = taskDetails;
    }

    public List getTaskDetails() {
        return taskDetails;
    }

    private String inboundNo;
    private String poNo;
    private String receivingStatus;
    private List taskDetails;
}
