// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UserPagingResult.java

package com.jd.open.api.sdk.response.user;

import java.io.Serializable;
import java.util.List;

public class UserPagingResult
        implements Serializable {

    public UserPagingResult() {
    }

    public void setUsers(List users) {
        this.users = users;
    }

    public List getUsers() {
        return users;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public int getTotalSize() {
        return totalSize;
    }

    private List users;
    private int totalSize;
}
