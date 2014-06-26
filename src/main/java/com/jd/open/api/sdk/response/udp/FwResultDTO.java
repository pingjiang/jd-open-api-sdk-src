// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FwResultDTO.java

package com.jd.open.api.sdk.response.udp;

import java.io.Serializable;
import java.util.List;

public class FwResultDTO
        implements Serializable {

    public FwResultDTO() {
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

    public void setList(List list) {
        this.list = list;
    }

    public List getList() {
        return list;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public Long getTotalSize() {
        return totalSize;
    }

    private Integer status;
    private String message;
    private List list;
    private Long totalSize;
}
