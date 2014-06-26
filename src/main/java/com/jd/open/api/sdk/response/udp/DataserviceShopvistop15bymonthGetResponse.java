// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DataserviceShopvistop15bymonthGetResponse.java

package com.jd.open.api.sdk.response.udp;

import com.jd.open.api.sdk.domain.udp.ShopVisTop15Interface.ShopVistResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DataserviceShopvistop15bymonthGetResponse extends AbstractResponse {

    public DataserviceShopvistop15bymonthGetResponse() {
    }

    public void setResultDTO(ShopVistResultDTO resultDTO) {
        this.resultDTO = resultDTO;
    }

    public ShopVistResultDTO getResultDTO() {
        return resultDTO;
    }

    private ShopVistResultDTO resultDTO;
}
