// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DropshipDpsDeliveryResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.supplier:
//            DeliverDoResultSetDto

public class DropshipDpsDeliveryResponse extends AbstractResponse {

    public DropshipDpsDeliveryResponse() {
    }

    public void setDeliverResult(DeliverDoResultSetDto deliverResult) {
        this.deliverResult = deliverResult;
    }

    public DeliverDoResultSetDto getDeliverResult() {
        return deliverResult;
    }

    private DeliverDoResultSetDto deliverResult;
}
