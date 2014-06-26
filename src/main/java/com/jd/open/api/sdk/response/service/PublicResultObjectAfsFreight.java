// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PublicResultObjectAfsFreight.java

package com.jd.open.api.sdk.response.service;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.service:
//            AfsFreightOut

public class PublicResultObjectAfsFreight
        implements Serializable {

    public PublicResultObjectAfsFreight() {
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResult(AfsFreightOut result) {
        this.result = result;
    }

    public AfsFreightOut getResult() {
        return result;
    }

    private Integer resultCode;
    private AfsFreightOut result;
}
