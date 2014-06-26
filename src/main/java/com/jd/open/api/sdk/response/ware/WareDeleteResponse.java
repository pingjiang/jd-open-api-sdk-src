// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareDeleteResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

public class WareDeleteResponse extends AbstractResponse {

    public WareDeleteResponse() {
    }

    public long getWareId() {
        return wareId;
    }

    public void setWareId(long wareId) {
        this.wareId = wareId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    private long wareId;
    private String created;
}
