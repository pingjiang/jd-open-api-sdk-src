// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ItemPictureResult.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;
import java.util.Date;

public class ItemPictureResult
        implements Serializable {

    public ItemPictureResult() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setSortNumber(int sortNumber) {
        this.sortNumber = sortNumber;
    }

    public int getSortNumber() {
        return sortNumber;
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
    private Long itemId;
    private Long sellerId;
    private String pictureUrl;
    private int sortNumber;
    private Date created;
    private Date modified;
}
