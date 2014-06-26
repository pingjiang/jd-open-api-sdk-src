// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PassLog.java

package com.jd.open.api.sdk.response.im;

import java.io.Serializable;
import java.util.Date;

public class PassLog
        implements Serializable {

    public PassLog() {
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setLoginSid(String loginSid) {
        this.loginSid = loginSid;
    }

    public String getLoginSid() {
        return loginSid;
    }

    private String waiter;
    private Date loginTime;
    private Date logoutTime;
    private String ip;
    private String loginSid;
}
