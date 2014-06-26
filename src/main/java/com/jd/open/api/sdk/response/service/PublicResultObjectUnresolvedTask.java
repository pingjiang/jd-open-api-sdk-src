// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultObjectUnresolvedTask.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PageUnresolvedTask

public class PublicResultObjectUnresolvedTask
        implements Serializable {

    public PublicResultObjectUnresolvedTask() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setUnresolvedAfsService(PageUnresolvedTask unresolvedAfsService) {
        this.unresolvedAfsService = unresolvedAfsService;
    }

    public PageUnresolvedTask getUnresolvedAfsService() {
        return unresolvedAfsService;
    }

    private Integer resultCode;
    private PageUnresolvedTask unresolvedAfsService;
}
