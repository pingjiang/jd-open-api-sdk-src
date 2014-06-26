// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HostingdataJddpDataAddResponse.java

package com.jd.open.api.sdk.response.udp;

import com.jd.open.api.sdk.domain.udp.DataChannelService.UploadResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class HostingdataJddpDataAddResponse extends AbstractResponse {

    public HostingdataJddpDataAddResponse() {
    }

    public void setResult(UploadResponse result) {
        this.result = result;
    }

    public UploadResponse getResult() {
        return result;
    }

    private UploadResponse result;
}
