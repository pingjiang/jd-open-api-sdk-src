// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DetailResultDto.java

package com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosAPI;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DetailResultDto
        implements Serializable {

    public DetailResultDto() {
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

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setAllocationDetailList(List allocationDetailList) {
        this.allocationDetailList = allocationDetailList;
    }

    public List getAllocationDetailList() {
        return allocationDetailList;
    }

    private Integer pageIndex;
    private Integer pageSize;
    private Integer recordCount;
    private Integer totalPage;
    private Long orderId;
    private Date deliveryTime;
    private List allocationDetailList;
}
