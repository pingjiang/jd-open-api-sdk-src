// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AreaTownGetResponse.java

package com.jd.open.api.sdk.response.address;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.address:
//            AreaListBeanVO

public class AreaTownGetResponse extends AbstractResponse {

    public AreaTownGetResponse() {
    }

    public void setTownAreas(AreaListBeanVO townAreas[]) {
        this.townAreas = townAreas;
    }

    public AreaListBeanVO[] getTownAreas() {
        return townAreas;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return success;
    }

    private AreaListBeanVO townAreas[];
    private Boolean success;
}
