// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultObjectAfsCategory.java

package com.jd.open.api.sdk.domain.service.AfsServiceConfFacade;

import java.io.Serializable;
import java.util.List;

public class PublicResultObjectAfsCategory
        implements Serializable {

    public PublicResultObjectAfsCategory() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setAfsCategoryList(List afsCategoryList) {
        this.afsCategoryList = afsCategoryList;
    }

    public List getAfsCategoryList() {
        return afsCategoryList;
    }

    private Integer resultCode;
    private List afsCategoryList;
}
