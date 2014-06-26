// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareAttributesGetResponse.java

package com.jd.open.api.sdk.response.website.category;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WareAttributesGetResponse extends AbstractResponse {

    public WareAttributesGetResponse() {
    }

    public List getWareAttributes() {
        return wareAttributes;
    }

    public void setWareAttributes(List wareAttributes) {
        this.wareAttributes = wareAttributes;
    }

    private List wareAttributes;
}
