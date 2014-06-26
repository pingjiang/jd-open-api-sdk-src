// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareProductSearchListGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            SearchProductList

public class WareProductSearchListGetResponse extends AbstractResponse {

    public WareProductSearchListGetResponse() {
    }

    public void setSearchProductList(SearchProductList searchProductList) {
        this.searchProductList = searchProductList;
    }

    public SearchProductList getSearchProductList() {
        return searchProductList;
    }

    private SearchProductList searchProductList;
}
