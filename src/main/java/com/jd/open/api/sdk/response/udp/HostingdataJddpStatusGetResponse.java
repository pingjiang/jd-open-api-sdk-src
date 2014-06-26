// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HostingdataJddpStatusGetResponse.java

package com.jd.open.api.sdk.response.udp;

import com.jd.open.api.sdk.domain.udp.DataChannelService.GetStatusResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class HostingdataJddpStatusGetResponse extends AbstractResponse {

    public HostingdataJddpStatusGetResponse() {
    }

    public void setResult(GetStatusResponse result) {
        this.result = result;
    }

    public GetStatusResponse getResult() {
        return result;
    }

    private GetStatusResponse result;
}
