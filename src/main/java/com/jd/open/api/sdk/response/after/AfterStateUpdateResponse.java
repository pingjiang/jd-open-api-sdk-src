// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AfterStateUpdateResponse.java

package com.jd.open.api.sdk.response.after;

import com.jd.open.api.sdk.response.AbstractResponse;

public class AfterStateUpdateResponse extends AbstractResponse {

    public AfterStateUpdateResponse() {
    }

    public AfterStateUpdateResponse(String venderId, String returnId) {
        this.venderId = venderId;
        this.returnId = returnId;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    private static final long serialVersionUID = 0xb753e1dfL;
    private String venderId;
    private String modified;
    private String returnId;
}
