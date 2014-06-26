// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderPrintDataConsignee.java

package com.jd.open.api.sdk.domain.order;


public class OrderPrintDataConsignee {

    public OrderPrintDataConsignee() {
    }

    public String getConsName() {
        return consName;
    }

    public void setConsName(String consName) {
        this.consName = consName;
    }

    public String getConsAddress() {
        return consAddress;
    }

    public void setConsAddress(String consAddress) {
        this.consAddress = consAddress;
    }

    public String getConsPhone() {
        return consPhone;
    }

    public void setConsPhone(String consPhone) {
        this.consPhone = consPhone;
    }

    public String getConsHandset() {
        return consHandset;
    }

    public void setConsHandset(String consHandset) {
        this.consHandset = consHandset;
    }

    private String consName;
    private String consAddress;
    private String consPhone;
    private String consHandset;
}
