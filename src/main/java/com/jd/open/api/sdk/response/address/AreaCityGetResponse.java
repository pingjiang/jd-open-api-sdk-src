// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AreaCityGetResponse.java

package com.jd.open.api.sdk.response.address;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.address:
//            AreaListBeanVO

public class AreaCityGetResponse extends AbstractResponse {

    public AreaCityGetResponse() {
    }

    public void setCityAreas(AreaListBeanVO cityAreas[]) {
        this.cityAreas = cityAreas;
    }

    public AreaListBeanVO[] getCityAreas() {
        return cityAreas;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return success;
    }

    private AreaListBeanVO cityAreas[];
    private Boolean success;
}
