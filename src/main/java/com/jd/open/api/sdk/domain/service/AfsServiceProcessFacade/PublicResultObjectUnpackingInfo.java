// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultObjectUnpackingInfo.java

package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade:
//            PartReceiveOut

public class PublicResultObjectUnpackingInfo
        implements Serializable {

    public PublicResultObjectUnpackingInfo() {
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

    public void setPartReceiveOut(PartReceiveOut partReceiveOut) {
        this.partReceiveOut = partReceiveOut;
    }

    public PartReceiveOut getPartReceiveOut() {
        return partReceiveOut;
    }

    private Integer resultCode;
    private String resultErrorMsg;
    private PartReceiveOut partReceiveOut;
}
