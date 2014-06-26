// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsCategoryOut.java

package com.jd.open.api.sdk.domain.service.AfsServiceConfFacade;

import java.io.Serializable;

public class AfsCategoryOut
        implements Serializable {

    public AfsCategoryOut() {
    }

    public void setAfsCategoryId(Integer afsCategoryId) {
        this.afsCategoryId = afsCategoryId;
    }

    public Integer getAfsCategoryId() {
        return afsCategoryId;
    }

    public void setAfsCategoryName(String afsCategoryName) {
        this.afsCategoryName = afsCategoryName;
    }

    public String getAfsCategoryName() {
        return afsCategoryName;
    }

    private Integer afsCategoryId;
    private String afsCategoryName;
}
