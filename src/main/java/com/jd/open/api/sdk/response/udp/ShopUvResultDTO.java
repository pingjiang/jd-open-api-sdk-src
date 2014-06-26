// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ShopUvResultDTO.java

package com.jd.open.api.sdk.response.udp;

import java.io.Serializable;
import java.util.List;

public class ShopUvResultDTO
        implements Serializable {

    public ShopUvResultDTO() {
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

    private String message;
    private List list;
    private Long totalSize;
}
