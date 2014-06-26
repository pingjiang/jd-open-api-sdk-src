// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AbstractResponse.java

package com.jd.open.api.sdk.response;

import java.io.Serializable;

public abstract class AbstractResponse
        implements Serializable {

    public AbstractResponse() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getZhDesc() {
        return zhDesc;
    }

    public void setZhDesc(String msg) {
        zhDesc = msg;
    }

    public String getEnDesc() {
        return enDesc;
    }

    public void setEnDesc(String enDesc) {
        this.enDesc = enDesc;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private static final long serialVersionUID = 0xca6586d9L;
    private String code;
    private String url;
    private String zhDesc;
    private String enDesc;
    protected String msg;
}
