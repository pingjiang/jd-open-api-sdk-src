// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ItemProxyResult.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            CategoryProxyResult

public class ItemProxyResult
        implements Serializable {

    public ItemProxyResult() {
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setCategoryProxyResult(CategoryProxyResult categoryProxyResult) {
        this.categoryProxyResult = categoryProxyResult;
    }

    public CategoryProxyResult getCategoryProxyResult() {
        return categoryProxyResult;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getSellerId() {
        return sellerId;
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

    public void setItemDes(String itemDes) {
        this.itemDes = itemDes;
    }

    public String getItemDes() {
        return itemDes;
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

    public void setSkuProxyResults(List skuProxyResults) {
        this.skuProxyResults = skuProxyResults;
    }

    public List getSkuProxyResults() {
        return skuProxyResults;
    }

    public void setItemPictureProxyResults(List itemPictureProxyResults) {
        this.itemPictureProxyResults = itemPictureProxyResults;
    }

    public List getItemPictureProxyResults() {
        return itemPictureProxyResults;
    }

    private Long itemId;
    private String itemName;
    private CategoryProxyResult categoryProxyResult;
    private Long sellerId;
    private Integer itemStatus;
    private String itemLocation;
    private String brand;
    private Integer weight;
    private String packListing;
    private String aftService;
    private String specParam;
    private String itemDes;
    private Date created;
    private Date modified;
    private List skuProxyResults;
    private List itemPictureProxyResults;
}
