// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultObjectAfsService.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            AfsServiceOut

public class PublicResultObjectAfsService
        implements Serializable {

    public PublicResultObjectAfsService() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setAfsServiceOut(AfsServiceOut afsServiceOut) {
        this.afsServiceOut = afsServiceOut;
    }

    public AfsServiceOut getAfsServiceOut() {
        return afsServiceOut;
    }

    private Integer resultCode;
    private AfsServiceOut afsServiceOut;
}
