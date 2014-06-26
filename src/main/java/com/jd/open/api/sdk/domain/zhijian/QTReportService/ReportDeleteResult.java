// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReportDeleteResult.java

package com.jd.open.api.sdk.domain.zhijian.QTReportService;

import java.io.Serializable;

public class ReportDeleteResult
        implements Serializable {

    public ReportDeleteResult() {
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

    private Boolean success;
    private String rCode;
    private String rMsg;
}
