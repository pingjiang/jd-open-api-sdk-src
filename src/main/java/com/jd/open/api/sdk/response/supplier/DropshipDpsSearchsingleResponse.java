// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DropshipDpsSearchsingleResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.supplier:
//            QuerySingleOrderForJosResultDto

public class DropshipDpsSearchsingleResponse extends AbstractResponse {

    public DropshipDpsSearchsingleResponse() {
    }

    public void setSearchSingleResult(QuerySingleOrderForJosResultDto searchSingleResult) {
        this.searchSingleResult = searchSingleResult;
    }

    public QuerySingleOrderForJosResultDto getSearchSingleResult() {
        return searchSingleResult;
    }

    private QuerySingleOrderForJosResultDto searchSingleResult;
}
