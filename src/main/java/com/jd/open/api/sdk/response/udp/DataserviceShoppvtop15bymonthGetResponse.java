// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DataserviceShoppvtop15bymonthGetResponse.java

package com.jd.open.api.sdk.response.udp;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.udp:
//            ShopPvResultDTO

public class DataserviceShoppvtop15bymonthGetResponse extends AbstractResponse {

    public DataserviceShoppvtop15bymonthGetResponse() {
    }

    public void setResultDTO(ShopPvResultDTO resultDTO) {
        this.resultDTO = resultDTO;
    }

    public ShopPvResultDTO getResultDTO() {
        return resultDTO;
    }

    private ShopPvResultDTO resultDTO;
}
