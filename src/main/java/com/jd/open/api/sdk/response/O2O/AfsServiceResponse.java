// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsServiceResponse.java

package com.jd.open.api.sdk.response.O2O;

import java.io.Serializable;
import java.util.List;

public class AfsServiceResponse
        implements Serializable {

    public AfsServiceResponse() {
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

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setCurPageNum(Integer curPageNum) {
        this.curPageNum = curPageNum;
    }

    public Integer getCurPageNum() {
        return curPageNum;
    }

    public void setCustomerOrderList(List customerOrderList) {
        this.customerOrderList = customerOrderList;
    }

    public List getCustomerOrderList() {
        return customerOrderList;
    }

    private Integer processCode;
    private String processStatus;
    private String errorMessage;
    private Integer totalPage;
    private Integer curPageNum;
    private List customerOrderList;
}
