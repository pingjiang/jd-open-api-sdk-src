// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IpLookupResponse.java

package com.jd.open.api.sdk.response.address;

import java.io.Serializable;

// Referenced classes of package com.jd.open.api.sdk.response.address:
//            Location

public class IpLookupResponse
        implements Serializable {

    public IpLookupResponse() {
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setData(Location data) {
        this.data = data;
    }

    public Location getData() {
        return data;
    }

    private int status;
    private String message;
    private Location data;
}
