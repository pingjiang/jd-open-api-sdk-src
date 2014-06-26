// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CategoryProxyResult.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;
import java.util.Date;

public class CategoryProxyResult
        implements Serializable {

    public CategoryProxyResult() {
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return cid;
    }

    public void setParentCid(Long parentCid) {
        this.parentCid = parentCid;
    }

    public Long getParentCid() {
        return parentCid;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public String getCName() {
        return cName;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setHasLeaf(Integer hasLeaf) {
        this.hasLeaf = hasLeaf;
    }

    public Integer getHasLeaf() {
        return hasLeaf;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public Integer getLev() {
        return lev;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setHomeShow(Integer homeShow) {
        this.homeShow = homeShow;
    }

    public Integer getHomeShow() {
        return homeShow;
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

    private Long cid;
    private Long parentCid;
    private Long sellerId;
    private String cName;
    private Integer status;
    private Integer hasLeaf;
    private Integer lev;
    private Integer sortNumber;
    private Integer homeShow;
    private Date created;
    private Date modified;
}
