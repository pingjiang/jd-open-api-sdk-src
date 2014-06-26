// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RefundapplyResponse.java

package com.jd.open.api.sdk.domain.service.RefundapplySaf;

import java.io.Serializable;
import java.util.List;

public class RefundapplyResponse
        implements Serializable {

    public RefundapplyResponse() {
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return count;
    }

    public void setResults(List results) {
        this.results = results;
    }

    public List getResults() {
        return results;
    }

    public void setResultState(Boolean resultState) {
        this.resultState = resultState;
    }

    public Boolean getResultState() {
        return resultState;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    private Long count;
    private List results;
    private Boolean resultState;
    private String resultInfo;
}
