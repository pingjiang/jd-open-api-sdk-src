// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderVenderRemarkQueryByOrderIdResponse.java

package com.jd.open.api.sdk.response.order;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.order:
//            VenderRemarkQueryResult

public class OrderVenderRemarkQueryByOrderIdResponse extends AbstractResponse {

    public OrderVenderRemarkQueryByOrderIdResponse() {
    }

    public void setVenderRemarkQueryResult(VenderRemarkQueryResult venderRemarkQueryResult) {
        this.venderRemarkQueryResult = venderRemarkQueryResult;
    }

    public VenderRemarkQueryResult getVenderRemarkQueryResult() {
        return venderRemarkQueryResult;
    }

    private VenderRemarkQueryResult venderRemarkQueryResult;
}
