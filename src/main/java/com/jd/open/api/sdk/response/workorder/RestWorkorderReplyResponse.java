// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RestWorkorderReplyResponse.java

package com.jd.open.api.sdk.response.workorder;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.workorder:
//            WorkOrderResponse

public class RestWorkorderReplyResponse extends AbstractResponse {

    public RestWorkorderReplyResponse() {
    }

    public void setWorkOrder(WorkOrderResponse workOrder) {
        this.workOrder = workOrder;
    }

    public WorkOrderResponse getWorkOrder() {
        return workOrder;
    }

    private WorkOrderResponse workOrder;
}
