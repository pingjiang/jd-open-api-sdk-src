// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QTArticle.java

package com.jd.open.api.sdk.domain.zhijian.QTArticleService;

import java.io.Serializable;
import java.util.Date;

public class QTArticle
        implements Serializable {

    public QTArticle() {
    }

    public void setServiceItemCode(String serviceItemCode) {
        this.serviceItemCode = serviceItemCode;
    }

    public String getServiceItemCode() {
        return serviceItemCode;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void setAllNum(Integer allNum) {
        this.allNum = allNum;
    }

    public Integer getAllNum() {
        return allNum;
    }

    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }

    public Integer getUsedNum() {
        return usedNum;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    private String serviceItemCode;
    private String pin;
    private Integer allNum;
    private Integer usedNum;
    private Date expireTime;
}
