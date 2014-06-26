// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareBuytobuyListGetResponse.java

package com.jd.open.api.sdk.response.recommend;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.recommend:
//            BuyToBuyWidsList

public class WareBuytobuyListGetResponse extends AbstractResponse {

    public WareBuytobuyListGetResponse() {
    }

    public void setBuyToBuyWidsList(BuyToBuyWidsList buyToBuyWidsList) {
        this.buyToBuyWidsList = buyToBuyWidsList;
    }

    public BuyToBuyWidsList getBuyToBuyWidsList() {
        return buyToBuyWidsList;
    }

    private BuyToBuyWidsList buyToBuyWidsList;
}
