// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DataserviceShopsalesbydayGetResponse.java

package com.jd.open.api.sdk.response.udp;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.udp:
//            ShopSalesResultDTO

public class DataserviceShopsalesbydayGetResponse extends AbstractResponse {

    public DataserviceShopsalesbydayGetResponse() {
    }

    public void setResultDTO(ShopSalesResultDTO resultDTO) {
        this.resultDTO = resultDTO;
    }

    public ShopSalesResultDTO getResultDTO() {
        return resultDTO;
    }

    private ShopSalesResultDTO resultDTO;
}
