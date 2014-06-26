// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VenderRemarkQueryResult.java

package com.jd.open.api.sdk.response.order;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.order:
//            ApiJosResult, VenderRemark

public class VenderRemarkQueryResult
        implements Serializable {

    public VenderRemarkQueryResult() {
    }

    public void setApiJosResult(ApiJosResult apiJosResult) {
        this.apiJosResult = apiJosResult;
    }

    public ApiJosResult getApiJosResult() {
        return apiJosResult;
    }

    public void setVenderRemark(VenderRemark venderRemark) {
        this.venderRemark = venderRemark;
    }

    public VenderRemark getVenderRemark() {
        return venderRemark;
    }

    private ApiJosResult apiJosResult;
    private VenderRemark venderRemark;
}
