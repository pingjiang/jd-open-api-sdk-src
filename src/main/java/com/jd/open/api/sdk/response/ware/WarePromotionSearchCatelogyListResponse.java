// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WarePromotionSearchCatelogyListResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            SearchCatelogyList

public class WarePromotionSearchCatelogyListResponse extends AbstractResponse {

    public WarePromotionSearchCatelogyListResponse() {
    }

    public void setSearchCatelogyList(SearchCatelogyList searchCatelogyList) {
        this.searchCatelogyList = searchCatelogyList;
    }

    public SearchCatelogyList getSearchCatelogyList() {
        return searchCatelogyList;
    }

    private SearchCatelogyList searchCatelogyList;
}
