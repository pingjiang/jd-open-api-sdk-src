// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PoDetailPageGetResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosAPI.DetailResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PoDetailPageGetResponse extends AbstractResponse {

    public PoDetailPageGetResponse() {
    }

    public void setDetailResultDto(DetailResultDto detailResultDto) {
        this.detailResultDto = detailResultDto;
    }

    public DetailResultDto getDetailResultDto() {
        return detailResultDto;
    }

    private DetailResultDto detailResultDto;
}
