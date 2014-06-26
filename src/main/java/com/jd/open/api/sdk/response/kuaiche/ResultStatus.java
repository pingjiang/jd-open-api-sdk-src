// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ResultStatus.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;

public class ResultStatus
        implements Serializable {

    public ResultStatus() {
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Long getPlanId() {
        return planId;
    }

    private Integer code;
    private String message;
    private Long planId;
}
