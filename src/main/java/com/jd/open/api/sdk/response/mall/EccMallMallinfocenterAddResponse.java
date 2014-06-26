// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccMallMallinfocenterAddResponse.java

package com.jd.open.api.sdk.response.mall;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.mall:
//            MallInfoResult

public class EccMallMallinfocenterAddResponse extends AbstractResponse {

    public EccMallMallinfocenterAddResponse() {
    }

    public void setMallInfoResult(MallInfoResult mallInfoResult) {
        this.mallInfoResult = mallInfoResult;
    }

    public MallInfoResult getMallInfoResult() {
        return mallInfoResult;
    }

    private MallInfoResult mallInfoResult;
}
