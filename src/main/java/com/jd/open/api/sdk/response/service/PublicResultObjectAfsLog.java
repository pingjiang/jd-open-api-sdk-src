// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultObjectAfsLog.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            PageAfsLog

public class PublicResultObjectAfsLog
        implements Serializable {

    public PublicResultObjectAfsLog() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setAfsLog(PageAfsLog afsLog) {
        this.afsLog = afsLog;
    }

    public PageAfsLog getAfsLog() {
        return afsLog;
    }

    private Integer resultCode;
    private PageAfsLog afsLog;
}
