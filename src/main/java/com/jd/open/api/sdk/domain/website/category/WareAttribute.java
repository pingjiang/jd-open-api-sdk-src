// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareAttribute.java

package com.jd.open.api.sdk.domain.website.category;

import java.util.List;

public class WareAttribute {

    public WareAttribute() {
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(List attributeValues) {
        this.attributeValues = attributeValues;
    }

    private Long aid;
    private String name;
    private List attributeValues;
}
