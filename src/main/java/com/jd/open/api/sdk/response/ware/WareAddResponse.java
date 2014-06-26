// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareAddResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareAddResponse extends AbstractResponse {
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


    public WareAddResponse() {
    }

    public List getSkuInfo() {
        return skuInfo;
    }

    public void setSkuInfo(List skuInfo) {
        this.skuInfo = skuInfo;
    }

    public long getWareId() {
        return wareId;
    }

    public void setWareId(long wareId) {
        this.wareId = wareId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    private long wareId;
    private List skuInfo;
    private String created;
}
