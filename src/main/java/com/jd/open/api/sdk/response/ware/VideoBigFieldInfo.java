// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VideoBigFieldInfo.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;

public class VideoBigFieldInfo
        implements Serializable {

    public VideoBigFieldInfo() {
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setContentDesc(String contentDesc) {
        this.contentDesc = contentDesc;
    }

    public String getContentDesc() {
        return contentDesc;
    }

    public void setEditerDesc(String editerDesc) {
        this.editerDesc = editerDesc;
    }

    public String getEditerDesc() {
        return editerDesc;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue;
    }

    public String getCatalogue() {
        return catalogue;
    }

    public void setBoxContents(String boxContents) {
        this.boxContents = boxContents;
    }

    public String getBoxContents() {
        return boxContents;
    }

    public void setMaterialDescription(String materialDescription) {
        this.materialDescription = materialDescription;
    }

    public String getMaterialDescription() {
        return materialDescription;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    public String getManual() {
        return manual;
    }

    private String comments;
    private String image;
    private String contentDesc;
    private String editerDesc;
    private String catalogue;
    private String boxContents;
    private String materialDescription;
    private String manual;
}
