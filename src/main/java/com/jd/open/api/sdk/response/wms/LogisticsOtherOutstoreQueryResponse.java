// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsOtherOutstoreQueryResponse.java

package com.jd.open.api.sdk.response.wms;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.Date;
import java.util.List;

public class LogisticsOtherOutstoreQueryResponse extends AbstractResponse {

    public LogisticsOtherOutstoreQueryResponse() {
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

    public void setJoslOutboundNo(String joslOutboundNo) {
        this.joslOutboundNo = joslOutboundNo;
    }

    public String getJoslOutboundNo() {
        return joslOutboundNo;
    }

    public void setIsvOutboundNo(String isvOutboundNo) {
        this.isvOutboundNo = isvOutboundNo;
    }

    public String getIsvOutboundNo() {
        return isvOutboundNo;
    }

    public void setJoslStatus(String joslStatus) {
        this.joslStatus = joslStatus;
    }

    public String getJoslStatus() {
        return joslStatus;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setOrderDetails(List orderDetails) {
        this.orderDetails = orderDetails;
    }

    public List getOrderDetails() {
        return orderDetails;
    }

    public void setCarriersId(String carriersId) {
        this.carriersId = carriersId;
    }

    public String getCarriersId() {
        return carriersId;
    }

    public void setCarriersName(String carriersName) {
        this.carriersName = carriersName;
    }

    public String getCarriersName() {
        return carriersName;
    }

    public void setDeliveryNoList(List deliveryNoList) {
        this.deliveryNoList = deliveryNoList;
    }

    public List getDeliveryNoList() {
        return deliveryNoList;
    }

    private int processCode;
    private String processStatus;
    private String errorMessage;
    private String joslOutboundNo;
    private String isvOutboundNo;
    private String joslStatus;
    private Date completeTime;
    private List orderDetails;
    private String carriersId;
    private String carriersName;
    private List deliveryNoList;
}
