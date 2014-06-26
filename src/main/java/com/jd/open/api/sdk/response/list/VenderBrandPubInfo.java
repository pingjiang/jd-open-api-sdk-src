// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VenderBrandPubInfo.java

package com.jd.open.api.sdk.response.list;

import java.io.Serializable;

public class VenderBrandPubInfo
        implements Serializable {

    public VenderBrandPubInfo() {
    }

    public void setErpBrandId(Integer erpBrandId) {
        this.erpBrandId = erpBrandId;
    }

    public Integer getErpBrandId() {
        return erpBrandId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    private Integer erpBrandId;
    private String brandName;
}
