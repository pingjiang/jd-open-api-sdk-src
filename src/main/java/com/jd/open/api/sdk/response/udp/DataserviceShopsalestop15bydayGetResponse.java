// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DataserviceShopsalestop15bydayGetResponse.java

package com.jd.open.api.sdk.response.udp;

import com.jd.open.api.sdk.domain.udp.ShopSalesTop15Interface.ShopSalesTop15ResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DataserviceShopsalestop15bydayGetResponse extends AbstractResponse {

    public DataserviceShopsalestop15bydayGetResponse() {
    }

    public void setResultDTO(ShopSalesTop15ResultDTO resultDTO) {
        this.resultDTO = resultDTO;
    }

    public ShopSalesTop15ResultDTO getResultDTO() {
        return resultDTO;
    }

    private ShopSalesTop15ResultDTO resultDTO;
}
