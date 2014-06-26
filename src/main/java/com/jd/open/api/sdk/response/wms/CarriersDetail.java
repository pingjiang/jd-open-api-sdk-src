// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CarriersDetail.java

package com.jd.open.api.sdk.response.wms;

import java.io.Serializable;

public class CarriersDetail
        implements Serializable {

    public CarriersDetail() {
    }

    public void setCarriersId(String carriersId) {
        this.carriersId = carriersId;
    }

    public String getCarriersId() {
        return carriersId;
    }

    public void setCarriersName(String carriersName) {
        this.carriersName = carriersName;
    }

    public String getCarriersName() {
        return carriersName;
    }

    public void setCarriersPhone(String carriersPhone) {
        this.carriersPhone = carriersPhone;
    }

    public String getCarriersPhone() {
        return carriersPhone;
    }

    private String carriersId;
    private String carriersName;
    private String carriersPhone;
}
