// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DropshipDpsSearchResponse.java

package com.jd.open.api.sdk.response.supplier;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.supplier:
//            QueryOrderForJosResultListDto

public class DropshipDpsSearchResponse extends AbstractResponse {

    public DropshipDpsSearchResponse() {
    }

    public void setSearchResult(QueryOrderForJosResultListDto searchResult) {
        this.searchResult = searchResult;
    }

    public QueryOrderForJosResultListDto getSearchResult() {
        return searchResult;
    }

    private QueryOrderForJosResultListDto searchResult;
}
