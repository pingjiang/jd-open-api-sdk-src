// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderOrderDeleteCancelApplyResponse.java

package com.jd.open.api.sdk.response.order;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.order:
//            ApiJosResult

public class OrderOrderDeleteCancelApplyResponse extends AbstractResponse {

    public OrderOrderDeleteCancelApplyResponse() {
    }

    public void setResult(ApiJosResult result) {
        this.result = result;
    }

    public ApiJosResult getResult() {
        return result;
    }

    private ApiJosResult result;
}
