// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ChatSession.java

package com.jd.open.api.sdk.response.im;

import java.io.Serializable;
import java.util.Date;

public class ChatSession
        implements Serializable {

    public ChatSession() {
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setSessionType(int sessionType) {
        this.sessionType = sessionType;
    }

    public int getSessionType() {
        return sessionType;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    public boolean getTransfer() {
        return transfer;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSid() {
        return sid;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    private String customer;
    private String waiter;
    private Date beginTime;
    private Date replyTime;
    private Date endTime;
    private int sessionType;
    private boolean transfer;
    private String sid;
    private Integer skuId;
}
