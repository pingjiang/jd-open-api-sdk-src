// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ApiJosResult.java

package com.jd.open.api.sdk.response.order;

import java.io.Serializable;

public class ApiJosResult
        implements Serializable {

    public ApiJosResult() {
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultDescribe(String resultDescribe) {
        this.resultDescribe = resultDescribe;
    }

    public String getResultDescribe() {
        return resultDescribe;
    }

    private boolean success;
    private String resultCode;
    private String resultDescribe;
}
