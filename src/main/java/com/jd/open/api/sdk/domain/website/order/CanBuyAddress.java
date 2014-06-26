// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CanBuyAddress.java

package com.jd.open.api.sdk.domain.website.order;


public class CanBuyAddress {

    public CanBuyAddress() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsSupCOD() {
        return isSupCOD;
    }

    public void setIsSupCOD(String isSupCOD) {
        this.isSupCOD = isSupCOD;
    }

    private Long id;
    private String name;
    private String isSupCOD;
}
