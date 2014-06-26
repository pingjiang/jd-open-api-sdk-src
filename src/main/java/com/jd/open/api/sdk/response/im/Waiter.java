// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Waiter.java

package com.jd.open.api.sdk.response.im;

import java.io.Serializable;

public class Waiter
        implements Serializable {

    public Waiter() {
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setYn(Byte yn) {
        this.yn = yn;
    }

    public Byte getYn() {
        return yn;
    }

    public void setLeader(boolean leader) {
        this.leader = leader;
    }

    public boolean getLeader() {
        return leader;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    private String waiter;
    private Byte yn;
    private boolean leader;
    private String level;
}
