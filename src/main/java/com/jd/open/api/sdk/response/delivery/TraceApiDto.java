// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TraceApiDto.java

package com.jd.open.api.sdk.response.delivery;

import java.io.Serializable;

public class TraceApiDto
        implements Serializable {

    public TraceApiDto() {
    }

    public void setOpeTitle(String opeTitle) {
        this.opeTitle = opeTitle;
    }

    public String getOpeTitle() {
        return opeTitle;
    }

    public void setOpeRemark(String opeRemark) {
        this.opeRemark = opeRemark;
    }

    public String getOpeRemark() {
        return opeRemark;
    }

    public void setOpeName(String opeName) {
        this.opeName = opeName;
    }

    public String getOpeName() {
        return opeName;
    }

    public void setOpeTime(String opeTime) {
        this.opeTime = opeTime;
    }

    public String getOpeTime() {
        return opeTime;
    }

    private String opeTitle;
    private String opeRemark;
    private String opeName;
    private String opeTime;
}
