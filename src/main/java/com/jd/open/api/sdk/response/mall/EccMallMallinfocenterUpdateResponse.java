// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccMallMallinfocenterUpdateResponse.java

package com.jd.open.api.sdk.response.mall;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.mall:
//            MallInfoResult

public class EccMallMallinfocenterUpdateResponse extends AbstractResponse {

    public EccMallMallinfocenterUpdateResponse() {
    }

    public void setMallInfoResult(MallInfoResult mallInfoResult) {
        this.mallInfoResult = mallInfoResult;
    }

    public MallInfoResult getMallInfoResult() {
        return mallInfoResult;
    }

    private MallInfoResult mallInfoResult;
}
