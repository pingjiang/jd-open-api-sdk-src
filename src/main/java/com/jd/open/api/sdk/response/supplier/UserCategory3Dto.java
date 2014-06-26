// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UserCategory3Dto.java

package com.jd.open.api.sdk.response.supplier;

import java.io.Serializable;

public class UserCategory3Dto
        implements Serializable {

    public UserCategory3Dto() {
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String code;
    private String name;
}
