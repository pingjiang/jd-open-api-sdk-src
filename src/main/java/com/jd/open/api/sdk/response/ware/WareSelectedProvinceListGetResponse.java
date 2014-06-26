// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareSelectedProvinceListGetResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            ProvinceList

public class WareSelectedProvinceListGetResponse extends AbstractResponse {

    public WareSelectedProvinceListGetResponse() {
    }

    public void setProvinceList(ProvinceList provinceList) {
        this.provinceList = provinceList;
    }

    public ProvinceList getProvinceList() {
        return provinceList;
    }

    private ProvinceList provinceList;
}
