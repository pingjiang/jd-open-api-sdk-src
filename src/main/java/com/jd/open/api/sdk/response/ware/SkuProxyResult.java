// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SkuProxyResult.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SkuProxyResult
        implements Serializable {

    public SkuProxyResult() {
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return skuId;
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

    public void setSkuStatus(Integer skuStatus) {
        this.skuStatus = skuStatus;
    }

    public Integer getSkuStatus() {
        return skuStatus;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setOccupiedInventory(Integer occupiedInventory) {
        this.occupiedInventory = occupiedInventory;
    }

    public Integer getOccupiedInventory() {
        return occupiedInventory;
    }

    public void setUsableInventory(Integer usableInventory) {
        this.usableInventory = usableInventory;
    }

    public Integer getUsableInventory() {
        return usableInventory;
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

    private Long skuId;
    private Long itemId;
    private Long sellerId;
    private Integer skuStatus;
    private String attributes;
    private BigDecimal marketPrice;
    private BigDecimal sellPrice;
    private BigDecimal costPrice;
    private Integer stockNum;
    private Integer occupiedInventory;
    private Integer usableInventory;
    private Date created;
    private Date modified;
}
