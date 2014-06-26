// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UserCategory3InfoDto.java

package com.jd.open.api.sdk.response.supplier;

import java.io.Serializable;
import java.util.List;

public class UserCategory3InfoDto
        implements Serializable {

    public UserCategory3InfoDto() {
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setUserCategory3Dtos(List userCategory3Dtos) {
        this.userCategory3Dtos = userCategory3Dtos;
    }

    public List getUserCategory3Dtos() {
        return userCategory3Dtos;
    }

    private String providerCode;
    private List userCategory3Dtos;
}
