// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzoneZoneInfo.java

package com.jd.open.api.sdk.response.imgzone;

import java.io.Serializable;
import java.util.Date;

public class ImgzoneZoneInfo
        implements Serializable {

    public ImgzoneZoneInfo() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
    }

    public Integer getUsedSize() {
        return usedSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return created;
    }

    private String name;
    private Integer usedSize;
    private Integer totalSize;
    private Date created;
}
