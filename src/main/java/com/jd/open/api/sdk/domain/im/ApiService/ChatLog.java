// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ChatLog.java

package com.jd.open.api.sdk.domain.im.ApiService;

import java.io.Serializable;
import java.util.Date;

public class ChatLog
        implements Serializable {

    public ChatLog() {
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

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSid() {
        return sid;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void setWaiterSend(boolean waiterSend) {
        this.waiterSend = waiterSend;
    }

    public boolean getWaiterSend() {
        return waiterSend;
    }

    private String customer;
    private String waiter;
    private String content;
    private String sid;
    private Long skuId;
    private Date time;
    private int channel;
    private boolean waiterSend;
}
