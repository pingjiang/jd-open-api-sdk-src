// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WosSubbiztypelistGetResponse.java

package com.jd.open.api.sdk.response.workorder;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class WosSubbiztypelistGetResponse extends AbstractResponse {

    public WosSubbiztypelistGetResponse() {
    }

    public void setSafBiztypeDtos(List safBiztypeDtos) {
        this.safBiztypeDtos = safBiztypeDtos;
    }

    public List getSafBiztypeDtos() {
        return safBiztypeDtos;
    }

    private List safBiztypeDtos;
}
