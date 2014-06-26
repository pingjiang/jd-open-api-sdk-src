// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JOSResult.java

package com.jd.open.api.sdk.domain.user.ExchangeJpeasFacade;

import java.io.Serializable;

public class JOSResult
        implements Serializable {

    public JOSResult() {
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    private String code;
    private String msg;
    private String data;
}
