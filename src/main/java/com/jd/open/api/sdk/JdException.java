// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JdException.java

package com.jd.open.api.sdk;


public class JdException extends Exception {

    public JdException() {
    }

    public JdException(String message, Throwable cause) {
        super(message, cause);
    }

    public JdException(String message) {
        super(message);
    }

    public JdException(Throwable cause) {
        super(cause);
    }

    public JdException(String errCode, String errMsg) {
        super((new StringBuilder()).append(errCode).append(": ").append(errMsg).toString());
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    private static final long serialVersionUID = 0xa8e52f93L;
    private String errCode;
    private String errMsg;
}
