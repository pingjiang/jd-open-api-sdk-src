// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ShopSalesTop15Response.java

package com.jd.open.api.sdk.domain.udp.ShopSalesTop15Interface;

import java.io.Serializable;

public class ShopSalesTop15Response
        implements Serializable {

    public ShopSalesTop15Response() {
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getProname() {
        return proname;
    }

    public void setRn(Integer rn) {
        this.rn = rn;
    }

    public Integer getRn() {
        return rn;
    }

    public void setSpusales(Double spusales) {
        this.spusales = spusales;
    }

    public Double getSpusales() {
        return spusales;
    }

    public void setSkusales(Double skusales) {
        this.skusales = skusales;
    }

    public Double getSkusales() {
        return skusales;
    }

    private Long wareId;
    private Long skuId;
    private String proname;
    private Integer rn;
    private Double spusales;
    private Double skusales;
}
