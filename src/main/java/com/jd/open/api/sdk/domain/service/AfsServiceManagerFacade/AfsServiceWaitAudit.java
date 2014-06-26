// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsServiceWaitAudit.java

package com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade;

import java.io.Serializable;
import java.util.Date;

public class AfsServiceWaitAudit
        implements Serializable {

    public AfsServiceWaitAudit() {
    }

    public void setAfsServiceId(Integer afsServiceId) {
        this.afsServiceId = afsServiceId;
    }

    public Integer getAfsServiceId() {
        return afsServiceId;
    }

    public void setAfsApplyTime(Date afsApplyTime) {
        this.afsApplyTime = afsApplyTime;
    }

    public Date getAfsApplyTime() {
        return afsApplyTime;
    }

    private Integer afsServiceId;
    private Date afsApplyTime;
}
