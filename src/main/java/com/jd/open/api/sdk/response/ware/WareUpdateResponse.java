// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareUpdateResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareUpdateResponse extends AbstractResponse {
    public static class SkuInfo {

        public long getSkuId() {
            return skuId;
        }

        public void setSkuId(long skuId) {
            this.skuId = skuId;
        }

        public String getAttribute() {
            return attribute;
        }

        public void setAttribute(String attribute) {
            this.attribute = attribute;
        }

        private long skuId;
        private String attribute;

        public SkuInfo() {
        }
    }


    public WareUpdateResponse() {
    }

    public List getSkuInfo() {
        return skuInfo;
    }

    public void setSkuInfo(List skuInfo) {
        this.skuInfo = skuInfo;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getWareId() {
        return wareId;
    }

    public void setWareId(String wareId) {
        this.wareId = wareId;
    }

    private String modified;
    private String wareId;
    private List skuInfo;
}
