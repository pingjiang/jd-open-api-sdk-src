// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ShopSalesResponse.java

package com.jd.open.api.sdk.response.udp;

import java.io.Serializable;

public class ShopSalesResponse
        implements Serializable {

    public ShopSalesResponse() {
    }

    public void setOnlProNum(Integer onlProNum) {
        this.onlProNum = onlProNum;
    }

    public Integer getOnlProNum() {
        return onlProNum;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getPv() {
        return pv;
    }

    public void setVisit(Integer visit) {
        this.visit = visit;
    }

    public Integer getVisit() {
        return visit;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public Integer getUv() {
        return uv;
    }

    public void setOrdQtty(Integer ordQtty) {
        this.ordQtty = ordQtty;
    }

    public Integer getOrdQtty() {
        return ordQtty;
    }

    public void setOrdProNum(Integer ordProNum) {
        this.ordProNum = ordProNum;
    }

    public Integer getOrdProNum() {
        return ordProNum;
    }

    public void setOrdAmount(Double ordAmount) {
        this.ordAmount = ordAmount;
    }

    public Double getOrdAmount() {
        return ordAmount;
    }

    public void setOrdCustNum(Integer ordCustNum) {
        this.ordCustNum = ordCustNum;
    }

    public Integer getOrdCustNum() {
        return ordCustNum;
    }

    public void setAvgOrdPrice(Double avgOrdPrice) {
        this.avgOrdPrice = avgOrdPrice;
    }

    public Double getAvgOrdPrice() {
        return avgOrdPrice;
    }

    public void setAvgCustPrice(Double avgCustPrice) {
        this.avgCustPrice = avgCustPrice;
    }

    public Double getAvgCustPrice() {
        return avgCustPrice;
    }

    public void setAvgCustOrdNum(Double avgCustOrdNum) {
        this.avgCustOrdNum = avgCustOrdNum;
    }

    public Double getAvgCustOrdNum() {
        return avgCustOrdNum;
    }

    public void setCustRate(Double custRate) {
        this.custRate = custRate;
    }

    public Double getCustRate() {
        return custRate;
    }

    public void setOrdRate(Double ordRate) {
        this.ordRate = ordRate;
    }

    public Double getOrdRate() {
        return ordRate;
    }

    private Integer onlProNum;
    private Integer pv;
    private Integer visit;
    private Integer uv;
    private Integer ordQtty;
    private Integer ordProNum;
    private Double ordAmount;
    private Integer ordCustNum;
    private Double avgOrdPrice;
    private Double avgCustPrice;
    private Double avgCustOrdNum;
    private Double custRate;
    private Double ordRate;
}
