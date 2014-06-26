// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImagePath.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;
import java.util.List;

public class ImagePath
        implements Serializable {

    public ImagePath() {
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setImageList(List imageList) {
        this.imageList = imageList;
    }

    public List getImageList() {
        return imageList;
    }

    private Integer skuId;
    private List imageList;
}
