// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KeywordQueryVO.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;
import java.util.List;

public class KeywordQueryVO
        implements Serializable {

    public KeywordQueryVO() {
    }

    public void setThirdCategoryid(Long thirdCategoryid) {
        this.thirdCategoryid = thirdCategoryid;
    }

    public Long getThirdCategoryid() {
        return thirdCategoryid;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortType(Integer sortType) {
        this.sortType = sortType;
    }

    public Integer getSortType() {
        return sortType;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setKeywordData(List keywordData) {
        this.keywordData = keywordData;
    }

    public List getKeywordData() {
        return keywordData;
    }

    private Long thirdCategoryid;
    private String sortField;
    private Integer sortType;
    private Integer totalNumber;
    private Integer pageSize;
    private Integer pageIndex;
    private List keywordData;
}
