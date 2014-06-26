// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BookBigFieldInfo.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;

public class BookBigFieldInfo
        implements Serializable {

    public BookBigFieldInfo() {
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

    public void setRelatedProducts(String relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public String getRelatedProducts() {
        return relatedProducts;
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

    public void setBookAbstract(String bookAbstract) {
        this.bookAbstract = bookAbstract;
    }

    public String getBookAbstract() {
        return bookAbstract;
    }

    public void setAuthorDesc(String authorDesc) {
        this.authorDesc = authorDesc;
    }

    public String getAuthorDesc() {
        return authorDesc;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getIntroduction() {
        return introduction;
    }

    private String comments;
    private String image;
    private String contentDesc;
    private String relatedProducts;
    private String editerDesc;
    private String catalogue;
    private String bookAbstract;
    private String authorDesc;
    private String introduction;
}
