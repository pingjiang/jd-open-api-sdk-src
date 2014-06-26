// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccItemGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            ItemProxyResult

public class EccItemGetResponse extends AbstractResponse {

    public EccItemGetResponse() {
    }

    public void setItemProxyResult(ItemProxyResult ItemProxyResult) {
        this.ItemProxyResult = ItemProxyResult;
    }

    public ItemProxyResult getItemProxyResult() {
        return ItemProxyResult;
    }

    private ItemProxyResult ItemProxyResult;
}
