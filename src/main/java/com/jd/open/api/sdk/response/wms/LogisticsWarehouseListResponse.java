// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsWarehouseListResponse.java

package com.jd.open.api.sdk.response.wms;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class LogisticsWarehouseListResponse extends AbstractResponse {

    public LogisticsWarehouseListResponse() {
    }

    public void setWarehouseDetails(List warehouseDetails) {
        this.warehouseDetails = warehouseDetails;
    }

    public List getWarehouseDetails() {
        return warehouseDetails;
    }

    private List warehouseDetails;
}
