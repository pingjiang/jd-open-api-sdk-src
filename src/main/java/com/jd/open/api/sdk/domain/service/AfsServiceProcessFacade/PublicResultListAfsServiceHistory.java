// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultListAfsServiceHistory.java

package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade;

import java.io.Serializable;
import java.util.List;

public class PublicResultListAfsServiceHistory
        implements Serializable {

    public PublicResultListAfsServiceHistory() {
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

    public void setAfsServiceHistoryList(List afsServiceHistoryList) {
        this.afsServiceHistoryList = afsServiceHistoryList;
    }

    public List getAfsServiceHistoryList() {
        return afsServiceHistoryList;
    }

    private Integer resultCode;
    private String resultErrorMsg;
    private List afsServiceHistoryList;
}
