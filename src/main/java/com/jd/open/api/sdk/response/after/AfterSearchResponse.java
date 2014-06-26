// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfterSearchResponse.java

package com.jd.open.api.sdk.response.after;

import com.jd.open.api.sdk.domain.after.ReturnGoods;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AfterSearchResponse extends AbstractResponse {

    public AfterSearchResponse() {
    }

    public AfterSearchResponse(ReturnGoods returnGoods) {
        this.returnGoods = returnGoods;
    }

    public ReturnGoods getReturnGoods() {
        return returnGoods;
    }

    public void setReturnGoods(ReturnGoods returnGoods) {
        this.returnGoods = returnGoods;
    }

    private static final long serialVersionUID = 0xcce06026L;
    private ReturnGoods returnGoods;
}
