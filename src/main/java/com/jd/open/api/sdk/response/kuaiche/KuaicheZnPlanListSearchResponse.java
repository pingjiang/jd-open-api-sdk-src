// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KuaicheZnPlanListSearchResponse.java

package com.jd.open.api.sdk.response.kuaiche;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.kuaiche:
//            QueryPlanReturnInfo

public class KuaicheZnPlanListSearchResponse extends AbstractResponse {

    public KuaicheZnPlanListSearchResponse() {
    }

    public void setPlanListInfo(QueryPlanReturnInfo planListInfo) {
        this.planListInfo = planListInfo;
    }

    public QueryPlanReturnInfo getPlanListInfo() {
        return planListInfo;
    }

    private QueryPlanReturnInfo planListInfo;
}
