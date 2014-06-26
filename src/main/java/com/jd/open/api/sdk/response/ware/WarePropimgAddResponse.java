// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WarePropimgAddResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

public class WarePropimgAddResponse extends AbstractResponse {

    public WarePropimgAddResponse() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getWareId() {
        return wareId;
    }

    public void setWareId(long wareId) {
        this.wareId = wareId;
    }

    public String getAttributeValueId() {
        return attributeValueId;
    }

    public void setAttributeValueId(String attributeValueId) {
        this.attributeValueId = attributeValueId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    private long wareId;
    private String attributeValueId;
    private long id;
    private String created;
}
