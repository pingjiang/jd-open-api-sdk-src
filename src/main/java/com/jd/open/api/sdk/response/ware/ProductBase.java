// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProductBase.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;
import java.util.Date;

public class ProductBase
        implements Serializable {

    public ProductBase() {
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return state;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setValueWeight(String valueWeight) {
        this.valueWeight = valueWeight;
    }

    public String getValueWeight() {
        return valueWeight;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getLength() {
        return length;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getWidth() {
        return width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    public void setValuePayFirst(Integer valuePayFirst) {
        this.valuePayFirst = valuePayFirst;
    }

    public Integer getValuePayFirst() {
        return valuePayFirst;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setCid2(Integer cid2) {
        this.cid2 = cid2;
    }

    public Integer getCid2() {
        return cid2;
    }

    public void setProductArea(String productArea) {
        this.productArea = productArea;
    }

    public String getProductArea() {
        return productArea;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setWserve(String wserve) {
        this.wserve = wserve;
    }

    public String getWserve() {
        return wserve;
    }

    public void setAllnum(Integer allnum) {
        this.allnum = allnum;
    }

    public Integer getAllnum() {
        return allnum;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColorSequence(Integer colorSequence) {
        this.colorSequence = colorSequence;
    }

    public Integer getColorSequence() {
        return colorSequence;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSizeSequence(Integer sizeSequence) {
        this.sizeSequence = sizeSequence;
    }

    public Integer getSizeSequence() {
        return sizeSequence;
    }

    public void setEbrand(String ebrand) {
        this.ebrand = ebrand;
    }

    public String getEbrand() {
        return ebrand;
    }

    public void setCbrand(String cbrand) {
        this.cbrand = cbrand;
    }

    public String getCbrand() {
        return cbrand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    private Long skuId;
    private String name;
    private String imagePath;
    private Integer state;
    private Integer isDelete;
    private String brandName;
    private String valueWeight;
    private Integer length;
    private Integer width;
    private Integer height;
    private Integer valuePayFirst;
    private double weight;
    private Integer cid2;
    private String productArea;
    private Date saleDate;
    private String wserve;
    private Integer allnum;
    private Integer brandId;
    private String color;
    private Integer colorSequence;
    private String size;
    private Integer sizeSequence;
    private String ebrand;
    private String cbrand;
    private String model;
    private String category;
}
