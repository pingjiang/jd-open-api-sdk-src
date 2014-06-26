// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JosStockSalesDetail.java

package com.jd.open.api.sdk.domain.supplier.JosStockSalesService;

import java.io.Serializable;

public class JosStockSalesDetail
        implements Serializable {

    public JosStockSalesDetail() {
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setStockCount(Long stockCount) {
        this.stockCount = stockCount;
    }

    public Long getStockCount() {
        return stockCount;
    }

    public void setSales(Long sales) {
        this.sales = sales;
    }

    public Long getSales() {
        return sales;
    }

    private String productCode;
    private String productName;
    private Long stockCount;
    private Long sales;
}
