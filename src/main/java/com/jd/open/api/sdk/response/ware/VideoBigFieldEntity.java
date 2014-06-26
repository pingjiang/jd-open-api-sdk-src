// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VideoBigFieldEntity.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            VideoBigFieldInfo

public class VideoBigFieldEntity
        implements Serializable {

    public VideoBigFieldEntity() {
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setFirstClassId(Integer firstClassId) {
        this.firstClassId = firstClassId;
    }

    public Integer getFirstClassId() {
        return firstClassId;
    }

    public void setVideoBigFieldInfo(VideoBigFieldInfo videoBigFieldInfo) {
        this.videoBigFieldInfo = videoBigFieldInfo;
    }

    public VideoBigFieldInfo getVideoBigFieldInfo() {
        return videoBigFieldInfo;
    }

    private Integer skuId;
    private Integer firstClassId;
    private VideoBigFieldInfo videoBigFieldInfo;
}
