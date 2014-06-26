// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ItemSkuResult.java

package com.jd.open.api.sdk.request.ware;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ItemSkuResult
        implements Serializable {

    public ItemSkuResult() {
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

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return cid;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemLocation(String itemLocation) {
        this.itemLocation = itemLocation;
    }

    public String getItemLocation() {
        return itemLocation;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setPackListing(String packListing) {
        this.packListing = packListing;
    }

    public String getPackListing() {
        return packListing;
    }

    public void setAftService(String aftService) {
        this.aftService = aftService;
    }

    public String getAftService() {
        return aftService;
    }

    public void setSpecParam(String specParam) {
        this.specParam = specParam;
    }

    public String getSpecParam() {
        return specParam;
    }

    public void setItemPictureResultList(List itemPictureResultList) {
        this.itemPictureResultList = itemPictureResultList;
    }

    public List getItemPictureResultList() {
        return itemPictureResultList;
    }

    private Long skuId;
    private Long itemId;
    private Long sellerId;
    private Integer skuStatus;
    private String attributes;
    private Date created;
    private Date modified;
    private String itemName;
    private Long cid;
    private Integer itemStatus;
    private String itemLocation;
    private String brand;
    private Integer weight;
    private String packListing;
    private String aftService;
    private String specParam;
    private List itemPictureResultList;
}
