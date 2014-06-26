// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MallRecommendWareResult.java

package com.jd.open.api.sdk.response.mall;

import java.io.Serializable;
import java.util.Date;

public class MallRecommendWareResult
        implements Serializable {

    public MallRecommendWareResult() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getSource() {
        return source;
    }

    public void setRecId(Long recId) {
        this.recId = recId;
    }

    public Long getRecId() {
        return recId;
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

    private Long id;
    private Integer sortNumber;
    private Long itemId;
    private Long sellerId;
    private Integer source;
    private Long recId;
    private Date created;
    private Date modified;
}
