// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SafWoOperDTO.java

package com.jd.open.api.sdk.response.workorder;

import java.io.Serializable;
import java.util.Date;

public class SafWoOperDTO
        implements Serializable {

    public SafWoOperDTO() {
    }

    public void setOperUser(String operUser) {
        this.operUser = operUser;
    }

    public String getOperUser() {
        return operUser;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }

    public Date getOperDate() {
        return operDate;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperContent(String operContent) {
        this.operContent = operContent;
    }

    public String getOperContent() {
        return operContent;
    }

    private String operUser;
    private Date operDate;
    private String operType;
    private String operContent;
}
