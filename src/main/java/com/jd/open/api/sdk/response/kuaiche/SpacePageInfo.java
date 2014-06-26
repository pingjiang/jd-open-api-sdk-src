// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SpacePageInfo.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;

public class SpacePageInfo
        implements Serializable {

    public SpacePageInfo() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    private Long id;
    private Integer available;
    private String categoryName;
    private Long parentId;
    private String url;
    private Integer type;
}
