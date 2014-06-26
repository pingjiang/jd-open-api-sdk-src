// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DropshipDpsRefuseResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.supplier:
//            RefuseResult

public class DropshipDpsRefuseResponse extends AbstractResponse {

    public DropshipDpsRefuseResponse() {
    }

    public void setRefuseResult(RefuseResult refuseResult) {
        this.refuseResult = refuseResult;
    }

    public RefuseResult getRefuseResult() {
        return refuseResult;
    }

    private RefuseResult refuseResult;
}
