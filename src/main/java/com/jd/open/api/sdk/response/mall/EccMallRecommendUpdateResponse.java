// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccMallRecommendUpdateResponse.java

package com.jd.open.api.sdk.response.mall;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.mall:
//            MallRecommendResult

public class EccMallRecommendUpdateResponse extends AbstractResponse {

    public EccMallRecommendUpdateResponse() {
    }

    public void setMallRecommendResult(MallRecommendResult MallRecommendResult) {
        this.MallRecommendResult = MallRecommendResult;
    }

    public MallRecommendResult getMallRecommendResult() {
        return MallRecommendResult;
    }

    private MallRecommendResult MallRecommendResult;
}
