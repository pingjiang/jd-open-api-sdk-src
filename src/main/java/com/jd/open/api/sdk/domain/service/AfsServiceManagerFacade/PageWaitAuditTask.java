// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PageWaitAuditTask.java

package com.jd.open.api.sdk.domain.service.AfsServiceManagerFacade;

import java.io.Serializable;
import java.util.List;

public class PageWaitAuditTask
        implements Serializable {

    public PageWaitAuditTask() {
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setResult(List result) {
        this.result = result;
    }

    public List getResult() {
        return result;
    }

    private int totalCount;
    private List result;
}
