// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DropshipDpsPrerefundResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.supplier:
//            PreRefundResult

public class DropshipDpsPrerefundResponse extends AbstractResponse {

    public DropshipDpsPrerefundResponse() {
    }

    public void setPrerefundResult(PreRefundResult prerefundResult) {
        this.prerefundResult = prerefundResult;
    }

    public PreRefundResult getPrerefundResult() {
        return prerefundResult;
    }

    private PreRefundResult prerefundResult;
}
