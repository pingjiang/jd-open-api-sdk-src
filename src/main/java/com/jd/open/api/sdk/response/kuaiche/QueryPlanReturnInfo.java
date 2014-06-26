// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryPlanReturnInfo.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;
import java.util.List;

public class QueryPlanReturnInfo
        implements Serializable {

    public QueryPlanReturnInfo() {
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setPlanList(List planList) {
        this.planList = planList;
    }

    public List getPlanList() {
        return planList;
    }

    private Integer totalNumber;
    private List planList;
}
