// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MallBannerResult.java

package com.jd.open.api.sdk.response.mall;

import java.io.Serializable;
import java.util.Date;

public class MallBannerResult
        implements Serializable {

    public MallBannerResult() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerLink(String bannerLink) {
        this.bannerLink = bannerLink;
    }

    public String getBannerLink() {
        return bannerLink;
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

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public Long getMallId() {
        return mallId;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    private Long id;
    private String bannerUrl;
    private String bannerLink;
    private Date created;
    private Date modified;
    private Long sellerId;
    private Long mallId;
    private Integer sortNumber;
}
