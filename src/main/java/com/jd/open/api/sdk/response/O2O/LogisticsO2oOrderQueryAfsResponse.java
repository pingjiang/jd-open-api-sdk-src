// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsO2oOrderQueryAfsResponse.java

package com.jd.open.api.sdk.response.O2O;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.O2O:
//            AfsServiceResponse

public class LogisticsO2oOrderQueryAfsResponse extends AbstractResponse {

    public LogisticsO2oOrderQueryAfsResponse() {
    }

    public void setAfsServiceResponse(AfsServiceResponse afsServiceResponse) {
        this.afsServiceResponse = afsServiceResponse;
    }

    public AfsServiceResponse getAfsServiceResponse() {
        return afsServiceResponse;
    }

    private AfsServiceResponse afsServiceResponse;
}
