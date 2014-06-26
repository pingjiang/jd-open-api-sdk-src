// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VenderRemark.java

package com.jd.open.api.sdk.response.order;

import java.io.Serializable;
import java.util.Date;

public class VenderRemark
        implements Serializable {

    public VenderRemark() {
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return created;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getModified() {
        return modified;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getFlag() {
        return flag;
    }

    private Long orderId;
    private String remark;
    private Date created;
    private Date modified;
    private int flag;
}
