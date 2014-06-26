// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WaiterDailyEvaStat.java

package com.jd.open.api.sdk.response.im;

import java.io.Serializable;

public class WaiterDailyEvaStat
        implements Serializable {

    public WaiterDailyEvaStat() {
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    private String date;
    private String waiter;
    private int score;
    private int count;
}
