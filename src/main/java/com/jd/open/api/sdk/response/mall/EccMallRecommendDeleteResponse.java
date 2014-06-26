// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccMallRecommendDeleteResponse.java

package com.jd.open.api.sdk.response.mall;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.mall:
//            MallRecommendResult

public class EccMallRecommendDeleteResponse extends AbstractResponse {

    public EccMallRecommendDeleteResponse() {
    }

    public void setMallRecommendResult(MallRecommendResult mallRecommendResult) {
        this.mallRecommendResult = mallRecommendResult;
    }

    public MallRecommendResult getMallRecommendResult() {
        return mallRecommendResult;
    }

    private MallRecommendResult mallRecommendResult;
}
