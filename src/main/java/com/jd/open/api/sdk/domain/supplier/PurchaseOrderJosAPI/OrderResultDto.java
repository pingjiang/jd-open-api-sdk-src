// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderResultDto.java

package com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosAPI;

import java.io.Serializable;
import java.util.List;

public class OrderResultDto
        implements Serializable {

    public OrderResultDto() {
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

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setPurchaseOrderList(List purchaseOrderList) {
        this.purchaseOrderList = purchaseOrderList;
    }

    public List getPurchaseOrderList() {
        return purchaseOrderList;
    }

    private Integer pageIndex;
    private Integer pageSize;
    private Integer recordCount;
    private Integer totalPage;
    private List purchaseOrderList;
}
