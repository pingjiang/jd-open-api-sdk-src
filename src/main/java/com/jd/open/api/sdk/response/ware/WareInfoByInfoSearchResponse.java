// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareInfoByInfoSearchResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareInfoByInfoSearchResponse extends AbstractResponse {
    public static class WareInfo {

        public Long getWareId() {
            return wareId;
        }

        public void setWareId(Long wareId) {
            this.wareId = wareId;
        }

        public Long getSpuId() {
            return spuId;
        }

        public void setSpuId(Long spuId) {
            this.spuId = spuId;
        }

        public Long getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
        }

        public Long getVenderId() {
            return venderId;
        }

        public void setVenderId(Long venderId) {
            this.venderId = venderId;
        }

        public Long getShopId() {
            return shopId;
        }

        public void setShopId(Long shopId) {
            this.shopId = shopId;
        }

        public String getWareStatus() {
            return wareStatus;
        }

        public void setWareStatus(String wareStatus) {
            this.wareStatus = wareStatus;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getItemNum() {
            return itemNum;
        }

        public void setItemNum(String itemNum) {
            this.itemNum = itemNum;
        }

        public String getUpcCode() {
            return upcCode;
        }

        public void setUpcCode(String upcCode) {
            this.upcCode = upcCode;
        }

        public Long getTransportId() {
            return transportId;
        }

        public void setTransportId(Long transportId) {
            this.transportId = transportId;
        }

        public String getOnlineTime() {
            return onlineTime;
        }

        public void setOnlineTime(String onlineTime) {
            this.onlineTime = onlineTime;
        }

        public String getOfflineTime() {
            return offlineTime;
        }

        public void setOfflineTime(String offlineTime) {
            this.offlineTime = offlineTime;
        }

        public String getAttributes() {
            return attributes;
        }

        public void setAttributes(String attributes) {
            this.attributes = attributes;
        }

        public String getCostPrice() {
            return costPrice;
        }

        public void setCostPrice(String costPrice) {
            this.costPrice = costPrice;
        }

        public String getMarketPrice() {
            return marketPrice;
        }

        public void setMarketPrice(String marketPrice) {
            this.marketPrice = marketPrice;
        }

        public String getJdPrice() {
            return jdPrice;
        }

        public void setJdPrice(String jdPrice) {
            this.jdPrice = jdPrice;
        }

        public long getStockNum() {
            return stockNum;
        }

        public void setStockNum(long stockNum) {
            this.stockNum = stockNum;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
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

        public String getOuterId() {
            return outerId;
        }

        public void setOuterId(String outerId) {
            this.outerId = outerId;
        }

        private Long wareId;
        private Long spuId;
        private Long categoryId;
        private Long venderId;
        private Long shopId;
        private String wareStatus;
        private String title;
        private String itemNum;
        private String upcCode;
        private Long transportId;
        private String onlineTime;
        private String offlineTime;
        private String attributes;
        private String costPrice;
        private String marketPrice;
        private String jdPrice;
        private long stockNum;
        private String logo;
        private String creator;
        private Integer status;
        private String weight;
        private String created;
        private String modified;
        private String outerId;

        public WareInfo() {
        }
    }


    public WareInfoByInfoSearchResponse() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List getWareInfos() {
        return wareInfos;
    }

    public void setWareInfos(List wareInfos) {
        this.wareInfos = wareInfos;
    }

    private List wareInfos;
    private int total;
}
