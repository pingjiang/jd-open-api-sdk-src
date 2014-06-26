// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImgzoneImgInfo.java

package com.jd.open.api.sdk.response.imgzone;

import java.io.Serializable;
import java.util.Date;

public class ImgzoneImgInfo
        implements Serializable {

    public ImgzoneImgInfo() {
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureCateId(Integer pictureCateId) {
        this.pictureCateId = pictureCateId;
    }

    public Integer getPictureCateId() {
        return pictureCateId;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureType(String pictureType) {
        this.pictureType = pictureType;
    }

    public String getPictureType() {
        return pictureType;
    }

    public void setReferenced(Integer referenced) {
        this.referenced = referenced;
    }

    public Integer getReferenced() {
        return referenced;
    }

    public void setPictureSize(int pictureSize) {
        this.pictureSize = pictureSize;
    }

    public int getPictureSize() {
        return pictureSize;
    }

    public void setPictureWidth(int pictureWidth) {
        this.pictureWidth = pictureWidth;
    }

    public int getPictureWidth() {
        return pictureWidth;
    }

    public void setPictureHeight(int pictureHeight) {
        this.pictureHeight = pictureHeight;
    }

    public int getPictureHeight() {
        return pictureHeight;
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

    private String pictureId;
    private Integer pictureCateId;
    private String pictureUrl;
    private String pictureName;
    private String pictureType;
    private Integer referenced;
    private int pictureSize;
    private int pictureWidth;
    private int pictureHeight;
    private Date created;
    private Date modified;
}
