// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ResponseMsg.java

package com.jd.open.api.sdk.domain.udp.MRSDKService;

import java.io.Serializable;

public class ResponseMsg
        implements Serializable {

    public ResponseMsg() {
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    private String code;
    private String message;
}
