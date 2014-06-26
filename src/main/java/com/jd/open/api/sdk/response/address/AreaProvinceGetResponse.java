// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AreaProvinceGetResponse.java

package com.jd.open.api.sdk.response.address;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.address:
//            AreaListBeanVO

public class AreaProvinceGetResponse extends AbstractResponse {

    public AreaProvinceGetResponse() {
    }

    public void setProvinceAreas(AreaListBeanVO provinceAreas[]) {
        this.provinceAreas = provinceAreas;
    }

    public AreaListBeanVO[] getProvinceAreas() {
        return provinceAreas;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return success;
    }

    private AreaListBeanVO provinceAreas[];
    private Boolean success;
}
