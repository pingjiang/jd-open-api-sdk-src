// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReportsResult.java

package com.jd.open.api.sdk.domain.zhijian.QTReportService;

import java.io.Serializable;
import java.util.List;

public class ReportsResult
        implements Serializable {

    public ReportsResult() {
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setRCode(String rCode) {
        this.rCode = rCode;
    }

    public String getRCode() {
        return rCode;
    }

    public void setRMsg(String rMsg) {
        this.rMsg = rMsg;
    }

    public String getRMsg() {
        return rMsg;
    }

    public void setQtReports(List qtReports) {
        this.qtReports = qtReports;
    }

    public List getQtReports() {
        return qtReports;
    }

    private Boolean success;
    private String rCode;
    private String rMsg;
    private List qtReports;
}
