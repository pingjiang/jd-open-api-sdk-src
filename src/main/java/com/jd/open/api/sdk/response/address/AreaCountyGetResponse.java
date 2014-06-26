// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AreaCountyGetResponse.java

package com.jd.open.api.sdk.response.address;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.address:
//            AreaListBeanVO

public class AreaCountyGetResponse extends AbstractResponse {

    public AreaCountyGetResponse() {
    }

    public void setCountyAreas(AreaListBeanVO countyAreas[]) {
        this.countyAreas = countyAreas;
    }

    public AreaListBeanVO[] getCountyAreas() {
        return countyAreas;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return success;
    }

    private AreaListBeanVO countyAreas[];
    private Boolean success;
}
