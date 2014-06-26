// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DataserviceFwreferpvGetResponse.java

package com.jd.open.api.sdk.response.udp;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.udp:
//            FwResultDTO

public class DataserviceFwreferpvGetResponse extends AbstractResponse {

    public DataserviceFwreferpvGetResponse() {
    }

    public void setResultDTO(FwResultDTO resultDTO) {
        this.resultDTO = resultDTO;
    }

    public FwResultDTO getResultDTO() {
        return resultDTO;
    }

    private FwResultDTO resultDTO;
}
