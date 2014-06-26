// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsRefundDto.java

package com.jd.open.api.sdk.response.O2O;

import java.io.Serializable;
import java.math.BigDecimal;

public class AfsRefundDto
        implements Serializable {

    public AfsRefundDto() {
    }

    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemMoney(BigDecimal itemMoney) {
        this.itemMoney = itemMoney;
    }

    public BigDecimal getItemMoney() {
        return itemMoney;
    }

    private String customerOrderId;
    private Integer typeId;
    private String itemName;
    private BigDecimal itemMoney;
}
