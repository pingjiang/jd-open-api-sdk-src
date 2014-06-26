// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MaterialLabelVO.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;
import java.math.BigDecimal;

public class MaterialLabelVO
        implements Serializable {

    public MaterialLabelVO() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setLabelBuyoutPrice(BigDecimal labelBuyoutPrice) {
        this.labelBuyoutPrice = labelBuyoutPrice;
    }

    public BigDecimal getLabelBuyoutPrice() {
        return labelBuyoutPrice;
    }

    public void setLabelCpcPrice(BigDecimal labelCpcPrice) {
        this.labelCpcPrice = labelCpcPrice;
    }

    public BigDecimal getLabelCpcPrice() {
        return labelCpcPrice;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getLabelName() {
        return labelName;
    }

    private String id;
    private BigDecimal labelBuyoutPrice;
    private BigDecimal labelCpcPrice;
    private String labelName;
}
