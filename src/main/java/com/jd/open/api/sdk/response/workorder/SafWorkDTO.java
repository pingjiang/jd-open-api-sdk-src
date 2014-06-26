// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SafWorkDTO.java

package com.jd.open.api.sdk.response.workorder;

import java.io.Serializable;
import java.util.Date;

public class SafWorkDTO
        implements Serializable {

    public SafWorkDTO() {
    }

    public void setWorkId(Long workId) {
        this.workId = workId;
    }

    public Long getWorkId() {
        return workId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    private Long workId;
    private Long orderId;
    private String statusName;
    private Date createDate;
    private String content;
}
