// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccItemAddResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            ItemProxyResult

public class EccItemAddResponse extends AbstractResponse {

    public EccItemAddResponse() {
    }

    public void setItemProxyResult(ItemProxyResult itemProxyResult) {
        this.itemProxyResult = itemProxyResult;
    }

    public ItemProxyResult getItemProxyResult() {
        return itemProxyResult;
    }

    private ItemProxyResult itemProxyResult;
}
