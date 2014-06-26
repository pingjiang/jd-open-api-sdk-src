// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnPlanDetailGetResponse.java

package com.jd.open.api.sdk.response.kuaiche;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.kuaiche:
//            PlanDetailInfo

public class KuaicheZnPlanDetailGetResponse extends AbstractResponse {

    public KuaicheZnPlanDetailGetResponse() {
    }

    public void setPlanDetailInfo(PlanDetailInfo planDetailInfo) {
        this.planDetailInfo = planDetailInfo;
    }

    public PlanDetailInfo getPlanDetailInfo() {
        return planDetailInfo;
    }

    private PlanDetailInfo planDetailInfo;
}
