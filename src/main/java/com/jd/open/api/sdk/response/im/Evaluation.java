// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Evaluation.java

package com.jd.open.api.sdk.response.im;

import java.io.Serializable;
import java.util.Date;

public class Evaluation
        implements Serializable {

    public Evaluation() {
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

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setEvaTime(Date evaTime) {
        this.evaTime = evaTime;
    }

    public Date getEvaTime() {
        return evaTime;
    }

    private String customer;
    private String waiter;
    private String desc;
    private int score;
    private Date evaTime;
}
