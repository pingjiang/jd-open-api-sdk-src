// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultObjectWaitProcessTask.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PageWaitProcessTask

public class PublicResultObjectWaitProcessTask
        implements Serializable {

    public PublicResultObjectWaitProcessTask() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setWaitProcessAfsService(PageWaitProcessTask waitProcessAfsService) {
        this.waitProcessAfsService = waitProcessAfsService;
    }

    public PageWaitProcessTask getWaitProcessAfsService() {
        return waitProcessAfsService;
    }

    private Integer resultCode;
    private PageWaitProcessTask waitProcessAfsService;
}
