// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsSignatureOut.java

package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade;

import java.io.Serializable;
import java.util.Date;

public class AfsSignatureOut
        implements Serializable {

    public AfsSignatureOut() {
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }

    public String getOpName() {
        return opName;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    public Date getOpTime() {
        return opTime;
    }

    private String opName;
    private String remark;
    private Date opTime;
}
