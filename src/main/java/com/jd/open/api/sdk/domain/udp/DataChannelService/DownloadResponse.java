// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DownloadResponse.java

package com.jd.open.api.sdk.domain.udp.DataChannelService;

import java.io.Serializable;
import java.util.List;

public class DownloadResponse
        implements Serializable {

    public DownloadResponse() {
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setColumnList(List columnList) {
        this.columnList = columnList;
    }

    public List getColumnList() {
        return columnList;
    }

    public void setDataList(List dataList) {
        this.dataList = dataList;
    }

    public List getDataList() {
        return dataList;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    private String resultCode;
    private List columnList;
    private List dataList;
    private String resultMsg;
}
