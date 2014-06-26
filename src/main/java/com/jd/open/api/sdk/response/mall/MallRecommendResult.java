// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MallRecommendResult.java

package com.jd.open.api.sdk.response.mall;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MallRecommendResult
        implements Serializable {

    public MallRecommendResult() {
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

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getPosition() {
        return position;
    }

    public void setRecType(Integer recType) {
        this.recType = recType;
    }

    public Integer getRecType() {
        return recType;
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

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public Long getMallId() {
        return mallId;
    }

    public void setRecommendWareList(List recommendWareList) {
        this.recommendWareList = recommendWareList;
    }

    public List getRecommendWareList() {
        return recommendWareList;
    }

    private Long id;
    private String title;
    private Long sellerId;
    private Integer position;
    private Integer recType;
    private Date created;
    private Date modified;
    private Long mallId;
    private List recommendWareList;
}
