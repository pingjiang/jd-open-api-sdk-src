// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultObjectRefundInfo.java

package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade:
//            AfsRefundInfoOut

public class PublicResultObjectRefundInfo
        implements Serializable {

    public PublicResultObjectRefundInfo() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultErrorMsg(String resultErrorMsg) {
        this.resultErrorMsg = resultErrorMsg;
    }

    public String getResultErrorMsg() {
        return resultErrorMsg;
    }

    public void setAfsRefundInfoOut(AfsRefundInfoOut afsRefundInfoOut) {
        this.afsRefundInfoOut = afsRefundInfoOut;
    }

    public AfsRefundInfoOut getAfsRefundInfoOut() {
        return afsRefundInfoOut;
    }

    private Integer resultCode;
    private String resultErrorMsg;
    private AfsRefundInfoOut afsRefundInfoOut;
}
