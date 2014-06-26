// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryRow.java

package com.jd.open.api.sdk.domain.udp.DataChannelService;

import java.io.Serializable;
import java.util.List;

public class QueryRow
        implements Serializable {

    public QueryRow() {
    }

    public void setValues(List values) {
        this.values = values;
    }

    public List getValues() {
        return values;
    }

    private List values;
}
