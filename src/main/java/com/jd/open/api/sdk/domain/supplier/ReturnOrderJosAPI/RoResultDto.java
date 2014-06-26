// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RoResultDto.java

package com.jd.open.api.sdk.domain.supplier.ReturnOrderJosAPI;

import java.io.Serializable;
import java.util.List;

public class RoResultDto
        implements Serializable {

    public RoResultDto() {
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    public Integer getRecordCount() {
        return recordCount;
    }

    public void setRoDtoList(List roDtoList) {
        this.roDtoList = roDtoList;
    }

    public List getRoDtoList() {
        return roDtoList;
    }

    private Integer pageIndex;
    private Integer pageSize;
    private Integer recordCount;
    private List roDtoList;
}
