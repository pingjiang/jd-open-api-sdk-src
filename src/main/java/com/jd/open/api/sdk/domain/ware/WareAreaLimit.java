// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareAreaLimit.java

package com.jd.open.api.sdk.domain.ware;

import java.io.Serializable;

public class WareAreaLimit
        implements Serializable {

    public WareAreaLimit() {
    }

    public Long getWareId() {
        return wareId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public Long getVenderId() {
        return venderId;
    }

    public void setVenderId(Long venderId) {
        this.venderId = venderId;
    }

    public Integer getAreaFid() {
        return areaFid;
    }

    public void setAreaFid(Integer areaFid) {
        this.areaFid = areaFid;
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAreaIds() {
        return areaIds;
    }

    public void setAreaIds(String areaIds) {
        this.areaIds = areaIds;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    private Long wareId;
    private Long venderId;
    private Integer areaFid;
    private Integer lev;
    private Integer type;
    private String areaIds;
    private String created;
    private String modified;
}
