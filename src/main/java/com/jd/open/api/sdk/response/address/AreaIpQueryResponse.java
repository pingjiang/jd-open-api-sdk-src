// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AreaIpQueryResponse.java

package com.jd.open.api.sdk.response.address;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.address:
//            IpLookupResponse

public class AreaIpQueryResponse extends AbstractResponse {

    public AreaIpQueryResponse() {
    }

    public void setJipResponse(IpLookupResponse jipResponse) {
        this.jipResponse = jipResponse;
    }

    public IpLookupResponse getJipResponse() {
        return jipResponse;
    }

    private IpLookupResponse jipResponse;
}
