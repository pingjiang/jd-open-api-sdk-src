// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AreaListBeanVO.java

package com.jd.open.api.sdk.response.address;

import java.io.Serializable;

public class AreaListBeanVO
        implements Serializable {

    public AreaListBeanVO() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIs3cod(String is3cod) {
        this.is3cod = is3cod;
    }

    public String getIs3cod() {
        return is3cod;
    }

    public void setCod(Boolean cod) {
        this.cod = cod;
    }

    public Boolean getCod() {
        return cod;
    }

    private Long id;
    private String name;
    private String is3cod;
    private Boolean cod;
}
