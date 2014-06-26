// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ResponseStock.java

package com.jd.open.api.sdk.response.wms;

import java.io.Serializable;
import java.util.List;

public class ResponseStock
        implements Serializable {

    public ResponseStock() {
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public String getProcessCode() {
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

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setStockDetails(List stockDetails) {
        this.stockDetails = stockDetails;
    }

    public List getStockDetails() {
        return stockDetails;
    }

    private String processCode;
    private String processStatus;
    private String errorMessage;
    private int totalPage;
    private List stockDetails;
}
