// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultObjectReceiveTask.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PageReceiveTask

public class PublicResultObjectReceiveTask
        implements Serializable {

    public PublicResultObjectReceiveTask() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setWaitReceiveAfsService(PageReceiveTask waitReceiveAfsService) {
        this.waitReceiveAfsService = waitReceiveAfsService;
    }

    public PageReceiveTask getWaitReceiveAfsService() {
        return waitReceiveAfsService;
    }

    private Integer resultCode;
    private PageReceiveTask waitReceiveAfsService;
}
