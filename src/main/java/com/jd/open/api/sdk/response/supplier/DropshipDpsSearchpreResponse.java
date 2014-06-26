// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DropshipDpsSearchpreResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.supplier:
//            ReturnOrderPreForJosResultListDto

public class DropshipDpsSearchpreResponse extends AbstractResponse {

    public DropshipDpsSearchpreResponse() {
    }

    public void setSearchPreResult(ReturnOrderPreForJosResultListDto searchPreResult) {
        this.searchPreResult = searchPreResult;
    }

    public ReturnOrderPreForJosResultListDto getSearchPreResult() {
        return searchPreResult;
    }

    private ReturnOrderPreForJosResultListDto searchPreResult;
}
