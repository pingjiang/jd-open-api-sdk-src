// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnPlanChannelCreateResponse.java

package com.jd.open.api.sdk.response.kuaiche;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.kuaiche:
//            ResultStatus

public class KuaicheZnPlanChannelCreateResponse extends AbstractResponse {

    public KuaicheZnPlanChannelCreateResponse() {
    }

    public void setResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
    }

    public ResultStatus getResultStatus() {
        return resultStatus;
    }

    private ResultStatus resultStatus;
}
