// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JosStockSales.java

package com.jd.open.api.sdk.domain.supplier.JosStockSalesService;

import java.io.Serializable;
import java.math.BigDecimal;

public class JosStockSales
        implements Serializable {

    public JosStockSales() {
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

    public void setStockTurnoverDays(BigDecimal stockTurnoverDays) {
        this.stockTurnoverDays = stockTurnoverDays;
    }

    public BigDecimal getStockTurnoverDays() {
        return stockTurnoverDays;
    }

    public void setStockRate(BigDecimal stockRate) {
        this.stockRate = stockRate;
    }

    public BigDecimal getStockRate() {
        return stockRate;
    }

    public void setManualVlt(BigDecimal manualVlt) {
        this.manualVlt = manualVlt;
    }

    public BigDecimal getManualVlt() {
        return manualVlt;
    }

    public void setAutoVlt(BigDecimal autoVlt) {
        this.autoVlt = autoVlt;
    }

    public BigDecimal getAutoVlt() {
        return autoVlt;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getWeek() {
        return week;
    }

    public void setManualSkuOrderFillRate(BigDecimal manualSkuOrderFillRate) {
        this.manualSkuOrderFillRate = manualSkuOrderFillRate;
    }

    public BigDecimal getManualSkuOrderFillRate() {
        return manualSkuOrderFillRate;
    }

    public void setManualUnitsOrderFillRate(BigDecimal manualUnitsOrderFillRate) {
        this.manualUnitsOrderFillRate = manualUnitsOrderFillRate;
    }

    public BigDecimal getManualUnitsOrderFillRate() {
        return manualUnitsOrderFillRate;
    }

    public void setAutoSkuOrderFillRate(BigDecimal autoSkuOrderFillRate) {
        this.autoSkuOrderFillRate = autoSkuOrderFillRate;
    }

    public BigDecimal getAutoSkuOrderFillRate() {
        return autoSkuOrderFillRate;
    }

    public void setAutoUnitsOrderFillRate(BigDecimal autoUnitsOrderFillRate) {
        this.autoUnitsOrderFillRate = autoUnitsOrderFillRate;
    }

    public BigDecimal getAutoUnitsOrderFillRate() {
        return autoUnitsOrderFillRate;
    }

    public void setSkuOrderFillRate(BigDecimal skuOrderFillRate) {
        this.skuOrderFillRate = skuOrderFillRate;
    }

    public BigDecimal getSkuOrderFillRate() {
        return skuOrderFillRate;
    }

    public void setUnitsOrderFillRate(BigDecimal unitsOrderFillRate) {
        this.unitsOrderFillRate = unitsOrderFillRate;
    }

    public BigDecimal getUnitsOrderFillRate() {
        return unitsOrderFillRate;
    }

    private Long stockCount;
    private Long sales;
    private BigDecimal stockTurnoverDays;
    private BigDecimal stockRate;
    private BigDecimal manualVlt;
    private BigDecimal autoVlt;
    private String week;
    private BigDecimal manualSkuOrderFillRate;
    private BigDecimal manualUnitsOrderFillRate;
    private BigDecimal autoSkuOrderFillRate;
    private BigDecimal autoUnitsOrderFillRate;
    private BigDecimal skuOrderFillRate;
    private BigDecimal unitsOrderFillRate;
}
