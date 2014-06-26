// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RankReturnJO.java

package com.jd.open.api.sdk.response.kuaiche;

import java.io.Serializable;

public class RankReturnJO
        implements Serializable {

    public RankReturnJO() {
    }

    public void setResponse(Integer response) {
        this.response = response;
    }

    public Integer getResponse() {
        return response;
    }

    public void setRank(Float rank[]) {
        this.rank = rank;
    }

    public Float[] getRank() {
        return rank;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPlanDate(String planDate) {
        this.planDate = planDate;
    }

    public String getPlanDate() {
        return planDate;
    }

    private Integer response;
    private Float rank[];
    private String description;
    private String planDate;
}
