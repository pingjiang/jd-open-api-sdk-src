// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HostingdataJddpDataListGetResponse.java

package com.jd.open.api.sdk.response.udp;

import com.jd.open.api.sdk.domain.udp.DataChannelService.DownloadResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class HostingdataJddpDataListGetResponse extends AbstractResponse {

    public HostingdataJddpDataListGetResponse() {
    }

    public void setResult(DownloadResponse result) {
        this.result = result;
    }

    public DownloadResponse getResult() {
        return result;
    }

    private DownloadResponse result;
}
