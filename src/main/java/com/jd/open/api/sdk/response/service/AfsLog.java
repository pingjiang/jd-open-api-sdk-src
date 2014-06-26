// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsLog.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;
import java.util.Date;

public class AfsLog
        implements Serializable {

    public AfsLog() {
    }

    public void setAfsLogId(Integer afsLogId) {
        this.afsLogId = afsLogId;
    }

    public Integer getAfsLogId() {
        return afsLogId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Integer getRelationId() {
        return relationId;
    }

    public void setOperateRemark(String operateRemark) {
        this.operateRemark = operateRemark;
    }

    public String getOperateRemark() {
        return operateRemark;
    }

    public void setOperatePin(String operatePin) {
        this.operatePin = operatePin;
    }

    public String getOperatePin() {
        return operatePin;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    public Date getOperateDate() {
        return operateDate;
    }

    private Integer afsLogId;
    private Integer relationId;
    private String operateRemark;
    private String operatePin;
    private String operateName;
    private Date operateDate;
}
