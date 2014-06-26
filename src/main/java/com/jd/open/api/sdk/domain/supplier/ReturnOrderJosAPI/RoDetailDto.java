// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RoDetailDto.java

package com.jd.open.api.sdk.domain.supplier.ReturnOrderJosAPI;

import java.io.Serializable;
import java.math.BigDecimal;

public class RoDetailDto
        implements Serializable {

    public RoDetailDto() {
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public String getWareName() {
        return wareName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setReturnsPrice(BigDecimal returnsPrice) {
        this.returnsPrice = returnsPrice;
    }

    public BigDecimal getReturnsPrice() {
        return returnsPrice;
    }

    public void setReturnsNum(Integer returnsNum) {
        this.returnsNum = returnsNum;
    }

    public Integer getReturnsNum() {
        return returnsNum;
    }

    public void setFactNum(Integer factNum) {
        this.factNum = factNum;
    }

    public Integer getFactNum() {
        return factNum;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setMakePrice(BigDecimal makePrice) {
        this.makePrice = makePrice;
    }

    public BigDecimal getMakePrice() {
        return makePrice;
    }

    private Long wareId;
    private String wareName;
    private String brandName;
    private BigDecimal returnsPrice;
    private Integer returnsNum;
    private Integer factNum;
    private BigDecimal totalPrice;
    private String isbn;
    private BigDecimal discount;
    private BigDecimal makePrice;
}
