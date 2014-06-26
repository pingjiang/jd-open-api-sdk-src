// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultObjectAllTask.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PageAllTask

public class PublicResultObjectAllTask
        implements Serializable {

    public PublicResultObjectAllTask() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setAllAfsService(PageAllTask allAfsService) {
        this.allAfsService = allAfsService;
    }

    public PageAllTask getAllAfsService() {
        return allAfsService;
    }

    private Integer resultCode;
    private PageAllTask allAfsService;
}
