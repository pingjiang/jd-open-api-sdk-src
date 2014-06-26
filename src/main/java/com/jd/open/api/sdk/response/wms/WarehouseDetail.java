// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WarehouseDetail.java

package com.jd.open.api.sdk.response.wms;

import java.io.Serializable;

public class WarehouseDetail
        implements Serializable {

    public WarehouseDetail() {
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehousePhone(String warehousePhone) {
        this.warehousePhone = warehousePhone;
    }

    public String getWarehousePhone() {
        return warehousePhone;
    }

    private String warehouseNo;
    private String warehouseName;
    private String warehouseAddress;
    private String warehousePhone;
}
