// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsSkuAddRequest.java

package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsSkuAddRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsSkuAddRequest() {
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGoodsAbbreviation(String goodsAbbreviation) {
        this.goodsAbbreviation = goodsAbbreviation;
    }

    public String getGoodsAbbreviation() {
        return goodsAbbreviation;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setBrandNo(String brandNo) {
        this.brandNo = brandNo;
    }

    public String getBrandNo() {
        return brandNo;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setGrossWeight(float grossWeight) {
        this.grossWeight = grossWeight;
    }

    public float getGrossWeight() {
        return grossWeight;
    }

    public void setNetWeight(float netWeight) {
        this.netWeight = netWeight;
    }

    public float getNetWeight() {
        return netWeight;
    }

    public void setSizeDefinition(String sizeDefinition) {
        this.sizeDefinition = sizeDefinition;
    }

    public String getSizeDefinition() {
        return sizeDefinition;
    }

    public void setSuppliersName(String suppliersName) {
        this.suppliersName = suppliersName;
    }

    public String getSuppliersName() {
        return suppliersName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setSuppliersNo(String suppliersNo) {
        this.suppliersNo = suppliersNo;
    }

    public String getSuppliersNo() {
        return suppliersNo;
    }

    public void setProductArea(String productArea) {
        this.productArea = productArea;
    }

    public String getProductArea() {
        return productArea;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    public void setIsSafe(int isSafe) {
        this.isSafe = isSafe;
    }

    public int getIsSafe() {
        return isSafe;
    }

    public void setSafeDate(String safeDate) {
        this.safeDate = safeDate;
    }

    public String getSafeDate() {
        return safeDate;
    }

    public String getApiMethod() {
        return "jingdong.logistics.sku.add";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("bar_code", barCode);
        pmap.put("sku_id", skuId);
        pmap.put("name", name);
        pmap.put("goods_abbreviation", goodsAbbreviation);
        pmap.put("category_id", categoryId);
        pmap.put("category_name", categoryName);
        pmap.put("brand_no", brandNo);
        pmap.put("brand_name", brandName);
        pmap.put("format", format);
        pmap.put("color", color);
        pmap.put("size", size);
        pmap.put("gross_weight", Float.valueOf(grossWeight));
        pmap.put("net_weight", Float.valueOf(netWeight));
        pmap.put("size_definition", sizeDefinition);
        pmap.put("suppliers_name", suppliersName);
        pmap.put("manufacturer", manufacturer);
        pmap.put("suppliers_no", suppliersNo);
        pmap.put("product_area", productArea);
        pmap.put("length", Float.valueOf(length));
        pmap.put("width", Float.valueOf(width));
        pmap.put("height", Float.valueOf(height));
        pmap.put("volume", Float.valueOf(volume));
        pmap.put("is_safe", Integer.valueOf(isSafe));
        pmap.put("safe_date", safeDate);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.wms.LogisticsSkuAddResponse.class;
    }

    private String barCode;
    private String skuId;
    private String name;
    private String goodsAbbreviation;
    private String categoryId;
    private String categoryName;
    private String brandNo;
    private String brandName;
    private String format;
    private String color;
    private String size;
    private float grossWeight;
    private float netWeight;
    private String sizeDefinition;
    private String suppliersName;
    private String manufacturer;
    private String suppliersNo;
    private String productArea;
    private float length;
    private float width;
    private float height;
    private float volume;
    private int isSafe;
    private String safeDate;
}
