// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VideoEntity.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            VideoInfo

public class VideoEntity
        implements Serializable {

    public VideoEntity() {
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setVideoInfo(VideoInfo videoInfo) {
        this.videoInfo = videoInfo;
    }

    public VideoInfo getVideoInfo() {
        return videoInfo;
    }

    private Integer skuId;
    private VideoInfo videoInfo;
}
