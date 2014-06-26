// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DropshipDpsOutboundResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.supplier:
//            OutBoundResultDto

public class DropshipDpsOutboundResponse extends AbstractResponse {

    public DropshipDpsOutboundResponse() {
    }

    public void setOutBoundResult(OutBoundResultDto outBoundResult) {
        this.outBoundResult = outBoundResult;
    }

    public OutBoundResultDto getOutBoundResult() {
        return outBoundResult;
    }

    private OutBoundResultDto outBoundResult;
}
