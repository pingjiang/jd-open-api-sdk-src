// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultObjectMajorCategory.java

package com.jd.open.api.sdk.domain.service.AfsServiceConfFacade;

import java.io.Serializable;
import java.util.List;

public class PublicResultObjectMajorCategory
        implements Serializable {

    public PublicResultObjectMajorCategory() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setMajorCategoryList(List majorCategoryList) {
        this.majorCategoryList = majorCategoryList;
    }

    public List getMajorCategoryList() {
        return majorCategoryList;
    }

    private Integer resultCode;
    private List majorCategoryList;
}
