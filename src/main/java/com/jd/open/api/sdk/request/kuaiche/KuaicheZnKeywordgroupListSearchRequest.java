// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnKeywordgroupListSearchRequest.java

package com.jd.open.api.sdk.request.kuaiche;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class KuaicheZnKeywordgroupListSearchRequest extends AbstractRequest
        implements JdRequest {

    public KuaicheZnKeywordgroupListSearchRequest() {
    }

    public void setThirdCategoryId(Long thirdCategoryId) {
        this.thirdCategoryId = thirdCategoryId;
    }

    public Long getThirdCategoryId() {
        return thirdCategoryId;
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

    public String getApiMethod() {
        return "jingdong.kuaiche.zn.keywordgroup.list.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("third_category_id", thirdCategoryId);
        pmap.put("sort_field", sortField);
        pmap.put("sort_type", sortType);
        pmap.put("page_size", pageSize);
        pmap.put("page_index", pageIndex);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.kuaiche.KuaicheZnKeywordgroupListSearchResponse.class;
    }

    private Long thirdCategoryId;
    private String sortField;
    private Integer sortType;
    private Integer pageSize;
    private Integer pageIndex;
}
