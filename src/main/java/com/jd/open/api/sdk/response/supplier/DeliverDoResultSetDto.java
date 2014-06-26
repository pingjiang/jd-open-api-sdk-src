// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeliverDoResultSetDto.java

package com.jd.open.api.sdk.response.supplier;

import java.io.Serializable;

public class DeliverDoResultSetDto
        implements Serializable {

    public DeliverDoResultSetDto() {
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    private Integer status;
    private String message;
    private String code;
}
