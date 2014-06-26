// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfsRefundInfoOut.java

package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.jd.open.api.sdk.domain.service.AfsServiceProcessFacade:
//            AfsFinanceOut, AfsRefundOut

public class AfsRefundInfoOut
        implements Serializable {

    public AfsRefundInfoOut() {
    }

    public void setAfsFinanceDetailOuts(List afsFinanceDetailOuts) {
        this.afsFinanceDetailOuts = afsFinanceDetailOuts;
    }

    public List getAfsFinanceDetailOuts() {
        return afsFinanceDetailOuts;
    }

    public void setAfsSignatureOut(List afsSignatureOut) {
        this.afsSignatureOut = afsSignatureOut;
    }

    public List getAfsSignatureOut() {
        return afsSignatureOut;
    }

    public void setAfsFinanceOut(AfsFinanceOut afsFinanceOut) {
        this.afsFinanceOut = afsFinanceOut;
    }

    public AfsFinanceOut getAfsFinanceOut() {
        return afsFinanceOut;
    }

    public void setAfsRefundOut(AfsRefundOut afsRefundOut) {
        this.afsRefundOut = afsRefundOut;
    }

    public AfsRefundOut getAfsRefundOut() {
        return afsRefundOut;
    }

    private List afsFinanceDetailOuts;
    private List afsSignatureOut;
    private AfsFinanceOut afsFinanceOut;
    private AfsRefundOut afsRefundOut;
}
