// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderResponse.java

package com.jd.open.api.sdk.response.O2O;

import java.io.Serializable;
import java.util.List;

public class OrderResponse
        implements Serializable {

    public OrderResponse() {
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

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setCurPageNum(int curPageNum) {
        this.curPageNum = curPageNum;
    }

    public int getCurPageNum() {
        return curPageNum;
    }

    public void setOrderList(List orderList) {
        this.orderList = orderList;
    }

    public List getOrderList() {
        return orderList;
    }

    private int processCode;
    private String processStatus;
    private String errorMessage;
    private int totalPage;
    private int curPageNum;
    private List orderList;
}
