// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccItemSearchResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            ItemPagingProxyResult

public class EccItemSearchResponse extends AbstractResponse {

    public EccItemSearchResponse() {
    }

    public void setResult(ItemPagingProxyResult result) {
        this.result = result;
    }

    public ItemPagingProxyResult getResult() {
        return result;
    }

    private ItemPagingProxyResult result;
}
