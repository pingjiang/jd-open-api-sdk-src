// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultObjectFinishedTask.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PageFinishedTask

public class PublicResultObjectFinishedTask
        implements Serializable {

    public PublicResultObjectFinishedTask() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setFinishedAfsService(PageFinishedTask finishedAfsService) {
        this.finishedAfsService = finishedAfsService;
    }

    public PageFinishedTask getFinishedAfsService() {
        return finishedAfsService;
    }

    private Integer resultCode;
    private PageFinishedTask finishedAfsService;
}
