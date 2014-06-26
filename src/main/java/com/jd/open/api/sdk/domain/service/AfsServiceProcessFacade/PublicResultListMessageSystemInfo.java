// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultListMessageSystemInfo.java

package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade;

import java.io.Serializable;
import java.util.List;

public class PublicResultListMessageSystemInfo
        implements Serializable {

    public PublicResultListMessageSystemInfo() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultErrorMsg(String resultErrorMsg) {
        this.resultErrorMsg = resultErrorMsg;
    }

    public String getResultErrorMsg() {
        return resultErrorMsg;
    }

    public void setMessageSystem(List messageSystem) {
        this.messageSystem = messageSystem;
    }

    public List getMessageSystem() {
        return messageSystem;
    }

    private Integer resultCode;
    private String resultErrorMsg;
    private List messageSystem;
}
