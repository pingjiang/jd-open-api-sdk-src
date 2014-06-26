// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnBidRankGetResponse.java

package com.jd.open.api.sdk.response.kuaiche;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.kuaiche:
//            RankReturnJO

public class KuaicheZnBidRankGetResponse extends AbstractResponse {

    public KuaicheZnBidRankGetResponse() {
    }

    public void setRankReturn(RankReturnJO rankReturn) {
        this.rankReturn = rankReturn;
    }

    public RankReturnJO getRankReturn() {
        return rankReturn;
    }

    private RankReturnJO rankReturn;
}
