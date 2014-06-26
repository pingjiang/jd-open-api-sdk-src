// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImPopGroupinfoGetResponse.java

package com.jd.open.api.sdk.response.im;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.im:
//            POPGroup

public class ImPopGroupinfoGetResponse extends AbstractResponse {

    public ImPopGroupinfoGetResponse() {
    }

    public void setPopgroup(POPGroup popgroup) {
        this.popgroup = popgroup;
    }

    public POPGroup getPopgroup() {
        return popgroup;
    }

    private POPGroup popgroup;
}
