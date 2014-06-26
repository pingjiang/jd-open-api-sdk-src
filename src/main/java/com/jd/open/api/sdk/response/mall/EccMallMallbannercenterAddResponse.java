// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccMallMallbannercenterAddResponse.java

package com.jd.open.api.sdk.response.mall;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.mall:
//            MallBannerResult

public class EccMallMallbannercenterAddResponse extends AbstractResponse {

    public EccMallMallbannercenterAddResponse() {
    }

    public void setMallBannerResult(MallBannerResult mallBannerResult) {
        this.mallBannerResult = mallBannerResult;
    }

    public MallBannerResult getMallBannerResult() {
        return mallBannerResult;
    }

    private MallBannerResult mallBannerResult;
}
