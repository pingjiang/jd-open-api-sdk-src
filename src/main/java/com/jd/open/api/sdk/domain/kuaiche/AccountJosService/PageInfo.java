// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PageInfo.java

package com.jd.open.api.sdk.domain.kuaiche.AccountJosService;

import java.io.Serializable;
import java.util.List;

public class PageInfo
        implements Serializable {

    public PageInfo() {
    }

    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Long getPageIndex() {
        return pageIndex;
    }

    public void setPageTotal(Long pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Long getPageTotal() {
        return pageTotal;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setDatas(List datas) {
        this.datas = datas;
    }

    public List getDatas() {
        return datas;
    }

    private Long pageIndex;
    private Long pageTotal;
    private Long pageSize;
    private List datas;
}
