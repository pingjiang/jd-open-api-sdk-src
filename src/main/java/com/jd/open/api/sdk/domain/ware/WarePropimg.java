// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WarePropimg.java

package com.jd.open.api.sdk.domain.ware;

import java.io.Serializable;

public class WarePropimg
        implements Serializable {

    public WarePropimg() {
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getMain() {
        return isMain;
    }

    public void setMain(String main) {
        isMain = main;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    private static final long serialVersionUID = 0x43b5ad1eL;
    private Long wareId;
    private Integer imgId;
    private String colorId;
    private String imgUrl;
    private String isMain;
    private String created;
}
