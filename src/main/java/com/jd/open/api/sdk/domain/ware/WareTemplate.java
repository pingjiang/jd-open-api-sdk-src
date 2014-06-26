// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WareTemplate.java

package com.jd.open.api.sdk.domain.ware;

import java.io.Serializable;

public class WareTemplate
        implements Serializable {

    public WareTemplate() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVenderId() {
        return venderId;
    }

    public void setVenderId(Long venderId) {
        this.venderId = venderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getContents() {
        return contents;
    }

    public void setContents(String contents[]) {
        this.contents = contents;
    }

    private Long id;
    private Long venderId;
    private String name;
    private String contents[];
}
