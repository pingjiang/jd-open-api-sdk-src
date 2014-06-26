// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VcGetReturnOrderDetailResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.domain.supplier.ReturnOrderJosAPI.DetailResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcGetReturnOrderDetailResponse extends AbstractResponse {

    public VcGetReturnOrderDetailResponse() {
    }

    public void setDetailResultDto(DetailResultDto detailResultDto) {
        this.detailResultDto = detailResultDto;
    }

    public DetailResultDto getDetailResultDto() {
        return detailResultDto;
    }

    private DetailResultDto detailResultDto;
}
