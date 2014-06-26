// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VcReturnOrderListPageGetResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.domain.supplier.ReturnOrderJosAPI.RoResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcReturnOrderListPageGetResponse extends AbstractResponse {

    public VcReturnOrderListPageGetResponse() {
    }

    public void setRoResultDto(RoResultDto roResultDto) {
        this.roResultDto = roResultDto;
    }

    public RoResultDto getRoResultDto() {
        return roResultDto;
    }

    private RoResultDto roResultDto;
}
