// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProvinceList.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;
import java.util.List;

public class ProvinceList
        implements Serializable {

    public ProvinceList() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setProvinces(List provinces) {
        this.provinces = provinces;
    }

    public List getProvinces() {
        return provinces;
    }

    private Integer resultCode;
    private List provinces;
}
