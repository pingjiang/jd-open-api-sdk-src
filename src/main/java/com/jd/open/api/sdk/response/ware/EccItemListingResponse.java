// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccItemListingResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            ItemResult

public class EccItemListingResponse extends AbstractResponse {

    public EccItemListingResponse() {
    }

    public void setResult(ItemResult result) {
        this.result = result;
    }

    public ItemResult getResult() {
        return result;
    }

    private ItemResult result;
}
