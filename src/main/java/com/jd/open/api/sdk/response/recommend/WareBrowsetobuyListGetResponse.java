// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareBrowsetobuyListGetResponse.java

package com.jd.open.api.sdk.response.recommend;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.recommend:
//            BrowseBuyWidsList

public class WareBrowsetobuyListGetResponse extends AbstractResponse {

    public WareBrowsetobuyListGetResponse() {
    }

    public void setBrowseBuyWidsList(BrowseBuyWidsList browseBuyWidsList) {
        this.browseBuyWidsList = browseBuyWidsList;
    }

    public BrowseBuyWidsList getBrowseBuyWidsList() {
        return browseBuyWidsList;
    }

    private BrowseBuyWidsList browseBuyWidsList;
}
