// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CatelogyAttributeList.java

package com.jd.open.api.sdk.response.list;

import java.io.Serializable;
import java.util.List;

public class CatelogyAttributeList
        implements Serializable {

    public CatelogyAttributeList() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setExpandSorts(List expandSorts) {
        this.expandSorts = expandSorts;
    }

    public List getExpandSorts() {
        return expandSorts;
    }

    private Integer resultCode;
    private List expandSorts;
}
