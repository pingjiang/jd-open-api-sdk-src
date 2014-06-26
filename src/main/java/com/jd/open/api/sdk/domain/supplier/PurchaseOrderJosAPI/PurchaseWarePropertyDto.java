// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PurchaseWarePropertyDto.java

package com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosAPI;

import java.io.Serializable;

public class PurchaseWarePropertyDto
        implements Serializable {

    public PurchaseWarePropertyDto() {
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setChest(Double chest) {
        this.chest = chest;
    }

    public Double getChest() {
        return chest;
    }

    public void setWaistline(Double waistline) {
        this.waistline = waistline;
    }

    public Double getWaistline() {
        return waistline;
    }

    public void setHip(Double hip) {
        this.hip = hip;
    }

    public Double getHip() {
        return hip;
    }

    public void setDressLength(Double dressLength) {
        this.dressLength = dressLength;
    }

    public Double getDressLength() {
        return dressLength;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMainPictureLink(String mainPictureLink) {
        this.mainPictureLink = mainPictureLink;
    }

    public String getMainPictureLink() {
        return mainPictureLink;
    }

    private Long wareId;
    private Double chest;
    private Double waistline;
    private Double hip;
    private Double dressLength;
    private Double height;
    private String color;
    private String mainPictureLink;
}
