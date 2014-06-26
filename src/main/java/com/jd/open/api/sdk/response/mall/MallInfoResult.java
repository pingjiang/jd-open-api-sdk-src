// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MallInfoResult.java

package com.jd.open.api.sdk.response.mall;

import java.io.Serializable;
import java.util.Date;

public class MallInfoResult
        implements Serializable {

    public MallInfoResult() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getSellerId() {
        return sellerId;
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

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return logo;
    }

    private Long id;
    private String title;
    private Long sellerId;
    private Date created;
    private Date modified;
    private String logo;
}
