// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GetStatusResponse.java

package com.jd.open.api.sdk.domain.udp.DataChannelService;

import java.io.Serializable;
import java.util.List;

public class GetStatusResponse
        implements Serializable {

    public GetStatusResponse() {
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setColumnList(String columnList[]) {
        this.columnList = columnList;
    }

    public String[] getColumnList() {
        return columnList;
    }

    public void setRowList(List rowList) {
        this.rowList = rowList;
    }

    public List getRowList() {
        return rowList;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    private String resultCode;
    private String columnList[];
    private List rowList;
    private String resultMsg;
}
