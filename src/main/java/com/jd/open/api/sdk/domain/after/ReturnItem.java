// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReturnItem.java

package com.jd.open.api.sdk.domain.after;


public class ReturnItem {

    public ReturnItem() {
    }

    public String getReturnItemId() {
        return returnItemId;
    }

    public void setReturnItemId(String returnItemId) {
        this.returnItemId = returnItemId;
    }

    public String getAttachmentCode() {
        return attachmentCode;
    }

    public void setAttachmentCode(String attachmentCode) {
        this.attachmentCode = attachmentCode;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    public String getModifidTime() {
        return modifidTime;
    }

    public void setModifidTime(String modifidTime) {
        this.modifidTime = modifidTime;
    }

    private String returnItemId;
    private String attachmentCode;
    private String skuId;
    private String skuName;
    private String orderId;
    private String price;
    private String returnType;
    private String returnReason;
    private String modifidTime;
}
