// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SafBiztypeDTO.java

package com.jd.open.api.sdk.response.workorder;

import java.io.Serializable;

public class SafBiztypeDTO
        implements Serializable {

    public SafBiztypeDTO() {
    }

    public void setSubBiztypeId(Long subBiztypeId) {
        this.subBiztypeId = subBiztypeId;
    }

    public Long getSubBiztypeId() {
        return subBiztypeId;
    }

    public void setSubBiztypeName(String subBiztypeName) {
        this.subBiztypeName = subBiztypeName;
    }

    public String getSubBiztypeName() {
        return subBiztypeName;
    }

    private Long subBiztypeId;
    private String subBiztypeName;
}
