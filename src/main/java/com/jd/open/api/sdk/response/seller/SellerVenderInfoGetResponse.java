// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SellerVenderInfoGetResponse.java

package com.jd.open.api.sdk.response.seller;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.seller:
//            VenderInfoResult

public class SellerVenderInfoGetResponse extends AbstractResponse {

    public SellerVenderInfoGetResponse() {
    }

    public void setVenderInfoResult(VenderInfoResult venderInfoResult) {
        this.venderInfoResult = venderInfoResult;
    }

    public VenderInfoResult getVenderInfoResult() {
        return venderInfoResult;
    }

    private VenderInfoResult venderInfoResult;
}
