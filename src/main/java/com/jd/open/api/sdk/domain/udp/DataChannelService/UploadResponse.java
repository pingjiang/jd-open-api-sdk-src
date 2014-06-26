// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UploadResponse.java

package com.jd.open.api.sdk.domain.udp.DataChannelService;

import java.io.Serializable;

public class UploadResponse
        implements Serializable {

    public UploadResponse() {
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    private String resultCode;
    private String resultMsg;
}
