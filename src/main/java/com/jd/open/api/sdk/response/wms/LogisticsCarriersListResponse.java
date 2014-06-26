// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsCarriersListResponse.java

package com.jd.open.api.sdk.response.wms;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class LogisticsCarriersListResponse extends AbstractResponse {

    public LogisticsCarriersListResponse() {
    }

    public void setCarriersDetails(List carriersDetails) {
        this.carriersDetails = carriersDetails;
    }

    public List getCarriersDetails() {
        return carriersDetails;
    }

    private List carriersDetails;
}
