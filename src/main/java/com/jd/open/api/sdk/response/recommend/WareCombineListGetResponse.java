// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareCombineListGetResponse.java

package com.jd.open.api.sdk.response.recommend;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.recommend:
//            CombineBuyingWidsList

public class WareCombineListGetResponse extends AbstractResponse {

    public WareCombineListGetResponse() {
    }

    public void setCombineBuyingWidsList(CombineBuyingWidsList combineBuyingWidsList) {
        this.combineBuyingWidsList = combineBuyingWidsList;
    }

    public CombineBuyingWidsList getCombineBuyingWidsList() {
        return combineBuyingWidsList;
    }

    private CombineBuyingWidsList combineBuyingWidsList;
}
