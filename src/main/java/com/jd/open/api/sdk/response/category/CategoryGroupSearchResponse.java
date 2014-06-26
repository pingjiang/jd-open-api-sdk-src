// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CategoryGroupSearchResponse.java

package com.jd.open.api.sdk.response.category;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class CategoryGroupSearchResponse extends AbstractResponse {

    public CategoryGroupSearchResponse() {
    }

    public List getGroups() {
        return groups;
    }

    public void setGroups(List groups) {
        this.groups = groups;
    }

    private List groups;
}
