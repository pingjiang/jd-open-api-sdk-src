// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProductSort.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;

public class ProductSort
        implements Serializable {

    public ProductSort() {
    }

    public void setProductSortId(Integer productSortId) {
        this.productSortId = productSortId;
    }

    public Integer getProductSortId() {
        return productSortId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setConte(String conte) {
        this.conte = conte;
    }

    public String getConte() {
        return conte;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSort() {
        return sort;
    }

    public void setIsFitService(Integer isFitService) {
        this.isFitService = isFitService;
    }

    public Integer getIsFitService() {
        return isFitService;
    }

    private Integer productSortId;
    private Integer fatherId;
    private String name;
    private Integer isDelete;
    private Integer grade;
    private String conte;
    private Integer sort;
    private Integer isFitService;
}
