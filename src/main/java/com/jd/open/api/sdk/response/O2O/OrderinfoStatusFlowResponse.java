// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderinfoStatusFlowResponse.java

package com.jd.open.api.sdk.response.O2O;

import java.io.Serializable;

public class OrderinfoStatusFlowResponse
        implements Serializable {

    public OrderinfoStatusFlowResponse() {
    }

    public void setStateValue(Byte stateValue) {
        this.stateValue = stateValue;
    }

    public Byte getStateValue() {
        return stateValue;
    }

    public void setStateTime(String stateTime) {
        this.stateTime = stateTime;
    }

    public String getStateTime() {
        return stateTime;
    }

    public void setStateOperator(String stateOperator) {
        this.stateOperator = stateOperator;
    }

    public String getStateOperator() {
        return stateOperator;
    }

    public void setStateRemark(String stateRemark) {
        this.stateRemark = stateRemark;
    }

    public String getStateRemark() {
        return stateRemark;
    }

    private Byte stateValue;
    private String stateTime;
    private String stateOperator;
    private String stateRemark;
}
