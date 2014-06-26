// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MaterialLableJO.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;
import java.math.BigDecimal;

public class MaterialLableJO
        implements Serializable {

    public MaterialLableJO() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setBuyoutPrice(BigDecimal buyoutPrice) {
        this.buyoutPrice = buyoutPrice;
    }

    public BigDecimal getBuyoutPrice() {
        return buyoutPrice;
    }

    public void setCpcPrice(BigDecimal cpcPrice) {
        this.cpcPrice = cpcPrice;
    }

    public BigDecimal getCpcPrice() {
        return cpcPrice;
    }

    private String id;
    private String labelName;
    private BigDecimal buyoutPrice;
    private BigDecimal cpcPrice;
}
