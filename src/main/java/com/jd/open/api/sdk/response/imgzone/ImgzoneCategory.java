// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzoneCategory.java

package com.jd.open.api.sdk.response.imgzone;

import java.io.Serializable;
import java.util.Date;

public class ImgzoneCategory
        implements Serializable {

    public ImgzoneCategory() {
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateLevel(Integer cateLevel) {
        this.cateLevel = cateLevel;
    }

    public Integer getCateLevel() {
        return cateLevel;
    }

    public void setParentCateId(Integer parentCateId) {
        this.parentCateId = parentCateId;
    }

    public Integer getParentCateId() {
        return parentCateId;
    }

    public void setCateOrder(Integer cateOrder) {
        this.cateOrder = cateOrder;
    }

    public Integer getCateOrder() {
        return cateOrder;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return created;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getModified() {
        return modified;
    }

    private Integer cateId;
    private String cateName;
    private Integer cateLevel;
    private Integer parentCateId;
    private Integer cateOrder;
    private Date created;
    private Date modified;
}
